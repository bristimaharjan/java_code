import java.util.*;
class MyException extends RuntimeException{
    MyException(String msg){
         super(msg);
    }

}
public class Exceptiondemo {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter marks of a subject");
        int marks = scan.nextInt();
        try{
            score(marks);
        }
        catch(MyException e)
        {
            System.out.println("Error !!"+e.getMessage());
        }
    }
    static void score(int marks)
    {
        if(marks<=0)
        {
            throw new MyException("Invalid  marks");
        }
    }
}
