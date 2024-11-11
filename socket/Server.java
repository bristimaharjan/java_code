package socket;

import java.net.*;
import java.io.*;
import java.util.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234);
             Socket socket = serverSocket.accept();
             BufferedReader inputFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter outputToClient = new PrintWriter(socket.getOutputStream(), true);
             Scanner scn = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a message: ");
                String message = scn.nextLine();
                outputToClient.println(message);
                String clientMessage = inputFromClient.readLine();
                System.out.println("Client: " + clientMessage);
                if (message.equalsIgnoreCase("bye") || clientMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Connection closed.");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
