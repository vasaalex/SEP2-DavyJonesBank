package client.view;
import client.model.MakeTransactionModel;
import javafx.beans.property.StringProperty;
import shared.Transaction;

/**
 * @author Tomasz Grzesiak
 */
public class MakeTransactionViewModel
  {
    private MakeTransactionModel makeTransactionModel;
    private StringProperty verificationMessage;

    public MakeTransactionViewModel(MakeTransactionModel makeTransactionModel)
      {
        this.makeTransactionModel = makeTransactionModel;
      }

    String attemptTransaction(Transaction transaction)
      {
        return makeTransactionModel.attemptTransaction(transaction);
      }
  }
