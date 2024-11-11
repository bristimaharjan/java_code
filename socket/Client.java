package socket;

import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            BufferedReader inputFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter outputToServer = new PrintWriter(socket.getOutputStream(), true);
            Scanner scn = new Scanner(System.in);
            while (true) {
                System.out.print("Enter a message: ");
                String message = scn.nextLine();
                outputToServer.println(message);
                String serverMessage = inputFromServer.readLine();
                System.out.println("Client: " + serverMessage);
                if (message.equalsIgnoreCase("bye") || serverMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Connection closed.");
                    break;
                }
            }

        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
