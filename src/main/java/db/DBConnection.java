package db;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    public static Connection mysqlConnection(){
        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/grpc_loginandreg?"+"user=root&password=");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
}