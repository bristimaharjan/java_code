import java.io.IOException;
import java.util.Scanner;

class MyCheckedException extends Exception{
    MyCheckedException(String msg){
        super(msg);
    }

}



class Exceptioncompile {

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int marks = scan.nextInt();
        try {
            score(marks);
        } catch (MyCheckedException e) {
            System.out.println("Error !!" + e.getMessage());
        }
    }

    static void score(int marks) throws MyCheckedException {
        if (marks <= 0) {
            throw new MyCheckedException ("Invalid marks");
        }
    }
}




