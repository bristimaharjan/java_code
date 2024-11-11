
import java.util.*;
public class Hashdemo {
    public static void main(String[] args){
        Set<String>obj= new HashSet<>();
        Scanner scan = new Scanner (System.in);
        int i;
        for(i=0;i<5;i++) {
            System.out.println("Enter Name for " + (i+1));
            String name =scan.nextLine();
            obj.add(name);

        }
        System.out.println(obj);



    }


}
