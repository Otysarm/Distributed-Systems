import java.io.*;
import java.net.*;
import java.util.Date;

public class Server extends Rank {
    public static void main(String[] args) {
        ServerSocket( int port, int backlog){
            int port = Integer.parseInt();
            backlog = 10;
        }
        try {
            while (true) {
                ServerSocket serverSocket = new ServerSocket(port);
                Socket socket = serverSocket.accept();
                System.out.println("Connection is successful!");

                OutputStream outputStream = socket.getOutputStream();

                PrintWriter writer = new PrintWriter(outputStream, true);
                writer.println(new Date().toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
}
