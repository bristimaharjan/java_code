


import java.util.*;
class InvalidException extends RuntimeException{
    InvalidException(String msg){
        super(msg);
    }

}
public class Executed {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter marks of a subject");
        int marks = scan.nextInt();
        try{
            score(marks);
        }
        catch(MyInvalidException e)
        {
            System.out.println("Error"+e.getMessage());
        }
        finally
        {
            System.out.println("The code is executed");
        }
    }
    static void score(int marks)
    {
        if(marks<=0)
        {
            throw new MyInvalidException("Invalid");
        }
    }
}
