
import java.util.Arrays;
import java.util.Scanner;

public class Inbuilt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline

        String[] strArray = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a string:");
            strArray[i] = sc.nextLine();
        }

        System.out.println("Array before sort:");
        for (String s : strArray) {
            System.out.println(s);
        }

        // Sorting without using the inbuilt function
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (strArray[i].compareTo(strArray[j]) > 0) {
                    String temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
        }

        System.out.println("Array after manual sort:");
        for (String s : strArray) {
            System.out.println(s);
        }

        // Sorting using the inbuilt Arrays.sort() function
        Arrays.sort(strArray);

        System.out.println("Array after sort using inbuilt function:");
        for (String s : strArray) {
            System.out.println(s);
        }
    }
}
