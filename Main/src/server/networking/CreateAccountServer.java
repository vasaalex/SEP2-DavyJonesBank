package server.networking;

import shared.Profile;
import shared.User;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CreateAccountServer extends Remote
{
  String sendUser(User user) throws RemoteException;
  String sendProfile(Profile profile) throws RemoteException;
}
