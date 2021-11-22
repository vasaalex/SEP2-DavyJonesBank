package client.view;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import shared.Transaction;

/**
 * @author Tomasz Grzesiak
 */
public class MakeTransactionController
  {
    @FXML private TextField recipientTextField;
    @FXML private TextField amountTextField;
    @FXML private ComboBox typeComboBox;

    private MakeTransactionViewModel makeTransactionVM;
    private ViewHandler vh;

    public void init(ViewHandler vh, MakeTransactionViewModel makeTransactionVM)
      {
        this.vh = vh;
        this.makeTransactionVM = makeTransactionVM;
      }

    public void submit()
      {
        // here the Transaction object, when its class is finally implemented, shall be filled with proper data from text fields.
        // By the way, the Transaction object should be created in View Model and NOT here, in a Controller class.
        // But in order to avoid yet another worthless discussion - I just followed provided piece of the Class Diagram
        Transaction transaction = new Transaction("Elon Musk");

        // asking the view model for submitting the transaction
        String result = makeTransactionVM.attemptTransaction(transaction);

        // showing result of the transaction
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        String titleAndHeader = "Transaction result";
        alert.setTitle(titleAndHeader);
        alert.setHeaderText(titleAndHeader);
        alert.setContentText(result);
        alert.showAndWait();
      }
  }
