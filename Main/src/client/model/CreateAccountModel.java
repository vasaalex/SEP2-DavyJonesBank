package client.model;

import shared.Profile;
import shared.User;

public interface CreateAccountModel
{
  String sendUser(User user);
  String sendProfile(Profile profile);

}
