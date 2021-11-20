package client.model;

import client.networking.Client;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeSupport;

public class CreateAccountModelManager implements CreateAccountModel
{

  private PropertyChangeSupport support = new PropertyChangeSupport(this);
  private Client client;

  public CreateAccountModelManager()
  {
    client.startClient();
    client.addListener("Account Creation State", this::onNewAccountCreated);
  }

  public void onNewAccountCreated(PropertyChangeEvent propertyChangeEvent){
    support.fireIndexedPropertyChange(propertyChangeEvent);
  }

  @Override public void sendUsername(String username)
  {
    return client.sendUsername(username);
  }

  @Override public void sendPassword(String password)
  {
    return client.sendPassword(password);
  }

  @Override public void sendFName(String fName)
  {
    return client.sendFname(fName);
  }

  @Override public void sendIName(String lName)
  {
    return client.sendLName(lName);
  }

  @Override public void sendEmail(String email)
  {
    return client.sendEmail(email);
  }

  @Override public void sendPhone(long phone)
  {
    return client.sendPhone(phone);
  }
}

