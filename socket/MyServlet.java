package socket;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class MyServlet {
    public static void main(String[] args) {
        try{
             Scanner scn = new Scanner(System.in);
             ServerSocket ss = new ServerSocket(1111);
             Socket s =ss.accept();
            PrintWriter writer = new PrintWriter(s.getOutputStream(), true);
             System.out.println("Enter two number ");
             int num1 = scn.nextInt();
             int num2 = scn.nextInt();
             int sum = num1 + num2;
             int mul = num1*num2;
             int sub=num1-num2;
             writer.println(sum);
             writer.println(mul);
             writer.println(sub);
             ss.close();

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
