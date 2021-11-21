package server.networking;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class CreateAccountServerImpl implements CreateAccountServer
{
  CreateAccountManager createAccountManager;


  public CreateAccountServerImpl(CreateAccountManager createAccountManager) throws
      RemoteException
  {
    UnicastRemoteObject.exportObject(this,0);
    this.createAccountManager = createAccountManager;
  }

  public void startServer() throws RemoteException, AlreadyBoundException
  {
    Registry registry = LocateRegistry.createRegistry(1099);
    registry.bind("Something",this);
  }

  @Override public String sendUser(User user) throws RemoteException
  {
    return user.toString();
  }

  @Override public String sendProfile(Profile profile) throws RemoteException
  {
    return profile.toString();
  }
}
