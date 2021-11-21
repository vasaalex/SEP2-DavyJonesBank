package client.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CreateAccountController
  {
    @FXML private Label firstNameLabel;
    @FXML private Label lastNameLabel;
    @FXML private Label emailLabel;
    @FXML private Label phoneLabel;
    @FXML private Label usernameLabel;
    @FXML private Label passwordLabel;
    @FXML private TextField firstNameTextField;
    @FXML private TextField lastNameTextField;
    @FXML private TextField emailTextField;
    @FXML private TextField phoneTextField;
    @FXML private TextField usernameTextField;
    @FXML private TextField passwordTextField;
    @FXML private Button createButton;

    private CreateAccountViewModel createAccountVM = new CreateAccountViewModel();
    private ViewHandler vh;

    public void init(ViewHandler vh, CreateAccountViewModel createAccountVM)
      {
        this.vh = vh;
        this.createAccountVM = createAccountVM;
      }

    public void create()
      {

      }
  }
