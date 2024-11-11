package socket;

import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 1111);
            BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));

            int sum = Integer.parseInt(reader.readLine());
            int mul = Integer.parseInt(reader.readLine());
            int sub = Integer.parseInt(reader.readLine());

            System.out.println("Sum: " + sum);
            System.out.println("Multiplication: " + mul);
            System.out.println("Subtraction: " + sub);

            s.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
