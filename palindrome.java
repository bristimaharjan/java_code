import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        String str = sc.nextLine();
        StringBuffer sb =new StringBuffer(str);
        sb.reverse();
        String rev =sb.toString();
        if(str.equals(rev)) {
            System.out.println("Palindrome" );
        }
            else{
                System.out.println("Not palindrome" );
            }
        }

    }

