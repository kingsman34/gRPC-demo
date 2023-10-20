package service;
import db.DBConnection;
import io.grpc.stub.StreamObserver;
import loginRegistration.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;

public class ServiceImpl extends loginAndRegistrationGrpc.loginAndRegistrationImplBase {
    Connection connection = DBConnection.mysqlConnection();
    @Override
    public void register(registration request, StreamObserver<response> responseObserver) {
        String checkQuery = "select count(*) from registration where emailId = ?";
        try {
            PreparedStatement checkStatement = connection.prepareStatement(checkQuery);
            checkStatement.setString(1, request.getEmailId());
            ResultSet resultSet = checkStatement.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count > 0) {
                    // User already exists, send an error response
                    responseObserver.onNext(response.newBuilder().setReply("User already exists").build());
                    responseObserver.onCompleted();
                    return;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String hashedPassword = hashPassword(request.getPassword());

        String insertQuery = "insert into registration(name,emailId,password) values(?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, request.getName());
            preparedStatement.setString(2, request.getEmailId());
            preparedStatement.setString(3, hashedPassword); // Store hashed password
            preparedStatement.execute();
            System.out.println("registered");
            responseObserver.onNext(response.newBuilder().setReply("added successfully").build());
            responseObserver.onCompleted();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void login(login request, StreamObserver<response> responseObserver) {
        String query = "SELECT * FROM registration WHERE emailId = ?";
        String name = "";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, request.getEmailId());
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String hashedPassword = resultSet.getString("password");
                String enteredPassword = request.getPassword();
                if (checkPassword(enteredPassword, hashedPassword)) {
                    name = resultSet.getString("name");
                } else {
                    responseObserver.onNext(response.newBuilder().setReply("Invalid credentials").build());
                    responseObserver.onCompleted();
                    return;
                }
            } else {
                responseObserver.onNext(response.newBuilder().setReply("Invalid credentials").build());
                responseObserver.onCompleted();
                return;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        responseObserver.onNext(response.newBuilder().setReply("Hi " + name).build());
        System.out.println("Hi " + name);
        responseObserver.onCompleted();
    }

    private boolean checkPassword(String enteredPassword, String hashedPassword) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(enteredPassword.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            String enteredPasswordHash = sb.toString();
            return enteredPasswordHash.equals(hashedPassword);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void changePassword(changePassword request, StreamObserver<response> responseObserver) {
        String checkQuery = "SELECT password FROM registration WHERE emailId = ?";
        String updateQuery = "UPDATE registration SET password = ? WHERE emailId = ?";

        try {
            PreparedStatement checkStatement = connection.prepareStatement(checkQuery);
            checkStatement.setString(1, request.getEmailId());
            ResultSet resultSet = checkStatement.executeQuery();

            if (resultSet.next()) {
                String hashedOldPassword = resultSet.getString("password");
                if (checkPassword(request.getOldPassword(), hashedOldPassword)) {
                    // Old password matches, update password
                    String hashedNewPassword = hashPassword(request.getNewPassword());

                    PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                    updateStatement.setString(1, hashedNewPassword);
                    updateStatement.setString(2, request.getEmailId());
                    updateStatement.executeUpdate();

                    responseObserver.onNext(response.newBuilder().setReply("Password updated successfully").build());
                    responseObserver.onCompleted();
                } else {
                    responseObserver.onNext(response.newBuilder().setReply("Invalid old password").build());
                    responseObserver.onCompleted();
                }
            } else {
                responseObserver.onNext(response.newBuilder().setReply("User not found").build());
                responseObserver.onCompleted();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}