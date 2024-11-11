package socket;


import java.net.*;
import java.util.*;

public class UdpServer {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(3000);
            byte[] buf = new byte[1024];
            Scanner scanner = new Scanner(System.in);

            while (true) {
                DatagramPacket dp = new DatagramPacket(buf, 1024);
                ds.receive(dp);
                String receivedMessage = new String(dp.getData(), 0, dp.getLength());
                System.out.println("Client: " + receivedMessage);

                if (receivedMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Connection closed.");
                    break;
                }

                System.out.print("Server: ");
                String response = scanner.nextLine();

                DatagramPacket senderPacket = new DatagramPacket(response.getBytes(), response.length(),
                        dp.getAddress(), dp.getPort());
                ds.send(senderPacket);

                if (response.equalsIgnoreCase("bye") || receivedMessage.equalsIgnoreCase("bye")) {
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

