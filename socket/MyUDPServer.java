package socket;
import java.net.*;
import java.util.*;
public class MyUDPServer {
        public static void main(String[] args) {
            try {
                DatagramSocket ds = new DatagramSocket(4444);
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();

                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();

                int add = num1 + num2;
                int sub = num1 - num2;
                int mul = num1 * num2;

                String addResult = "Addition: " + add;
                String subResult = "Subtraction: " + sub;
                String mulResult = "Multiplication: " + mul;

                DatagramPacket addPacket = new DatagramPacket(addResult.getBytes(), addResult.length(), InetAddress.getByName("127.0.0.1"), 5555);
                ds.send(addPacket);

                DatagramPacket subPacket = new DatagramPacket(subResult.getBytes(), subResult.length(), InetAddress.getByName("127.0.0.1"), 5555);
                ds.send(subPacket);

                DatagramPacket mulPacket = new DatagramPacket(mulResult.getBytes(), mulResult.length(), InetAddress.getByName("127.0.0.1"), 5555);
                ds.send(mulPacket);

                ds.close();
                System.out.println("Results sent to client.");

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


