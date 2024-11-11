import java.util.*;
public class Name {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter your name");
        String name = scn.nextLine();
        System.out.println("Name in capital :"+name.toUpperCase());
    }
}
