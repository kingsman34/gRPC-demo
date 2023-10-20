import io.grpc.ServerBuilder;
import service.ServiceImpl;

import java.io.IOException;
public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 8080;
        io.grpc.Server server = ServerBuilder.forPort(port).addService(new ServiceImpl()).build().start();
        System.out.println("Server started at port: "+port );
        server.awaitTermination();
    }
}