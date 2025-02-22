import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(22222);
        System.out.println("Server Started.. ");
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client Connected... ");
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            try {
                Object cMsg = ois.readObject();
                System.out.println("From Client : " + cMsg);

                String serverMsg = (String) cMsg;
                serverMsg = serverMsg.toUpperCase();
                oos.writeObject(serverMsg);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
