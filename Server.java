package program;
import java.io.*;
import java.net.*;
public class Server {
	public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8900);
            System.out.println("Server started. Waiting for client...");

            Socket s = ss.accept();
            System.out.println("Client connected!");

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in));

            String msgFromClient, msgFromServer;
            while (true) {
                // Read from client
                msgFromClient = in.readLine();
                if (msgFromClient == null || msgFromClient.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected.");
                    break;
                }
                System.out.println("Client: " + msgFromClient);

                // Send reply to client
                System.out.print("Server: ");
                msgFromServer = serverInput.readLine();
                out.println(msgFromServer);

                if (msgFromServer.equalsIgnoreCase("exit")) {
                    System.out.println("Server closed connection.");
                    break;
                }
            }

            s.close();
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
