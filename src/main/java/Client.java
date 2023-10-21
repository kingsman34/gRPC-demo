import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import loginRegistration.*;

public class Client {
    private final ManagedChannel channel;
    private final loginAndRegistrationGrpc.loginAndRegistrationBlockingStub blockingStub;

    public Client(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        blockingStub = loginAndRegistrationGrpc.newBlockingStub(channel);
    }

    public void shutdown() {
        channel.shutdown();
    }

    public void register(String name, String email, String password) {
        registration request = registration.newBuilder()
                .setName(name)
                .setEmailId(email)
                .setPassword(password)
                .build();

        response response = blockingStub.register(request);
        System.out.println(response.getReply());
    }

    public void login(String email, String password) {
        login request = login.newBuilder()
                .setEmailId(email)
                .setPassword(password)
                .build();

        response response = blockingStub.login(request);
        System.out.println(response.getReply());
    }

    public void changePassword(String email, String oldPassword, String newPassword) {
        changePassword request = changePassword.newBuilder()
                .setEmailId(email)
                .setOldPassword(oldPassword)
                .setNewPassword(newPassword)
                .build();

        response response = blockingStub.changePassword(request);
        System.out.println(response.getReply());
    }

    public static void main(String[] args) {
        Client client = new Client("localhost", 8080);

        try {
            // Example usage
            client.register("John Doe", "john@example.com", "password123");
            client.login("john@example.com", "password123");
            client.changePassword("john@example.com", "password123", "newpassword456");
        } finally {
            client.shutdown();
        }
    }
}
