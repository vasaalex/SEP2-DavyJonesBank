package client.model;

import client.networking.Client;
import client.networking.RMIClient;
import shared.Profile;
import shared.User;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeSupport;

public class CreateAccountModelManager implements CreateAccountModel
{

  private PropertyChangeSupport support;
  private Client client;

  public CreateAccountModelManager(Client client)
  {
    client.startClient();
    client.addPropertyListener("Account Creation State", this::onNewAccountCreated);
  }

  public void onNewAccountCreated(PropertyChangeEvent propertyChangeEvent)
  {
    support.firePropertyChange(propertyChangeEvent);
  }

  @Override public String sendUser(User user)
  {
    return client.sendUser(user);
  }

  @Override public String sendProfile(Profile profile)
  {
    return client.sendProfile(profile);
  }
}

