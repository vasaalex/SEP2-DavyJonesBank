package client.model;

import client.networking.Client;
import shared.Transaction;
import util.PropertyChangeSubject;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeSupport;

public class MakeTransactionModelManager implements MakeTransactionModel
{
  private Client client;
  private PropertyChangeSupport support;

  public MakeTransactionModelManager(Client client)
  {
    client.startClient();
    client.addPropertyListener("Account Creation State", this::onNewTransaction);
  }

  private void onNewTransaction(PropertyChangeEvent propertyChangeEvent)
  {
    support.firePropertyChange(propertyChangeEvent);
  }

  @Override public String attemptTransaction(Transaction transaction)
  {
    return null; // Not sure yet where I should pass the transaction object.
  }
}
