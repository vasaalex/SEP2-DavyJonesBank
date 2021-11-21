package client.view;

import client.model.CreateAccountModel;

import javafx.beans.property.StringProperty;
import javafx.scene.control.Alert;
import shared.Profile;
import shared.User;

public class CreateAccountViewModel
  {
    private CreateAccountModel createAccountModel;
    private StringProperty verificationMessage;

    public void sendUser(User user)
      {

      }
    public void sendProfile(Profile profile)
      {

      }
    public StringProperty getVerificationMessage()
      {
        return verificationMessage;
      }
  }
