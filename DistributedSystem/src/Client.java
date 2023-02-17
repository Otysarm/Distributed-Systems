import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * This is client program. it establishes connection with the server and exchange information
 * when the connection is successful
 **/
public class Client {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket();
            Socket socket = serverSocket.accept();
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String clientInput = bufferedReader.readLine();

            System.out.println(clientInput);
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
