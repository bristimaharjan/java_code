
import java.rmi.Remote;
import java.rmi.RemoteException;



public interface Number extends Remote {
    int addnum(int a, int b) throws RemoteException;
    int subnum(int a, int b) throws RemoteException;
}


