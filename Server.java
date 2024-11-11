import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
           
            NumberImpl obj = new NumberImpl();

           
            LocateRegistry.createRegistry(1099);
            Naming.rebind("num", obj);
            System.out.println("Server is running");
        } catch (Exception e) {
            System.out.println("Server is not running ");
            
        }
    }
}
