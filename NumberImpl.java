import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class NumberImpl extends UnicastRemoteObject implements Number {
    public NumberImpl() throws RemoteException {
        super();
    }


    public int addnum(int a, int b) throws RemoteException {
        return a + b;
    }


    public int subnum(int a, int b) throws RemoteException {
        return a - b;
    }
}
