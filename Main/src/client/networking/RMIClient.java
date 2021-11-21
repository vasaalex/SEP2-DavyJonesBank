package client.networking;

import server.networking.CreateAccountServer;
import shared.Profile;
import shared.User;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIClient implements Client, Remote {

    private LoginServer loginServer;
    private CreateAccountServer createAccountServer;
    private PropertyChangeSupport support;

    public RMIClient() throws RemoteException {
        support = new PropertyChangeSupport(this);
    }

    @Override
    public void startClient() {
        try {
            UnicastRemoteObject.exportObject(this, 0);
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            loginServer = (LoginServer) registry.lookup("SendMessageServer");
        }catch (RemoteException | NotBoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public String sendUser(User user) {
        String temp = null;
        try {
            temp = loginServer.sendUser(user);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return temp;
    }

    @Override
    public String sendProfile(Profile profile) {
        String temp = null;
        try {
            temp = createAccountServer.sendProfile(profile);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return temp;
    }

    @Override
    public void addPropertyListener(String eventName, PropertyChangeListener listener) {
        support.addPropertyChangeListener(eventName, listener);
    }

    @Override
    public void removePropertyListener(String eventName, PropertyChangeListener listener) {
        support.removePropertyChangeListener(eventName, listener);
    }

}
