package socket;

import java.net.*;
import java.util.*;


public class UdpClient {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            InetAddress ip = InetAddress.getByName("127.0.0.1");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Client: ");
                String message = scanner.nextLine();
                DatagramPacket dp = new DatagramPacket(message.getBytes(), message.length(), ip, 3000);
                ds.send(dp);
                byte[] buf = new byte[1024];
                DatagramPacket receivedPacket = new DatagramPacket(buf, 1024);
                ds.receive(receivedPacket);
                String serverMessage = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
                System.out.println("Server: " + serverMessage);
                if (message.equalsIgnoreCase("bye") || serverMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Connection closed.");
                    break;
                }
            }

            ds.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

