import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {

            Registry registry = LocateRegistry.getRegistry("localhost", 1099);


            Number remote = (Number) registry.lookup("num");


            int value = remote.addnum(5, 6);
            System.out.println("The sum is " + value);


            int value2 = remote.subnum(10, 4);
            System.out.println("The difference is " + value2);

        } catch (Exception e) {
            System.out.println("Failed connection");
        }
    }
}
