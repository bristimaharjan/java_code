import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Mapdemo {
    public static void main(String[] args) {
        Map<String, String> obj = new HashMap<String, String>();
        Scanner scan = new Scanner(System.in);
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("Enter animal as animal_type:animal_name" + (i + 1));

            String a = scan.nextLine();
            String array[]=a.split(":");
            obj.put(array[0],array[1]);





        }
        for (Map.Entry<String, String> me :
                obj.entrySet()) {
            System.out.print(me.getKey()+" :" );
            System.out.println(me.getValue());
        }
    }
}
