package client.model;

import shared.Transaction;

public interface MakeTransactionModel
{
  String attemptTransaction(Transaction transaction);
}
