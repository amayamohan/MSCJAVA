package program;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {
	 public static void main(String[] args) {
	        try {
	            Socket s = new Socket("localhost", 8900);
	            System.out.println("Connected to Server!");

	            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
	            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
	            Scanner sc = new Scanner(System.in);

	            String msgFromServer, msgFromClient;
	            while (true) {
	                // Send message to server
	                System.out.print("Client: ");
	                msgFromClient = sc.nextLine();
	                out.println(msgFromClient);

	                if (msgFromClient.equalsIgnoreCase("exit")) {
	                    System.out.println("Connection closed.");
	                    break;
	                }

	                // Read reply from server
	                msgFromServer = in.readLine();
	                if (msgFromServer == null || msgFromServer.equalsIgnoreCase("exit")) {
	                    System.out.println("Server disconnected.");
	                    break;
	                }
	                System.out.println("Server: " + msgFromServer);
	            }

	            s.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    } 

}
