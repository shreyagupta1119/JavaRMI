import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by shreya on 20/7/16.
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
