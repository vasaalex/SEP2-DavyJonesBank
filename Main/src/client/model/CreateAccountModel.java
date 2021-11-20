package client.model;

public interface CreateAccountModel
{
  public void sendUsername(String username);
  public void sendPassword(String password);
  public void sendFName(String fName);
  public void sendIName(String lName);
  public void sendEmail(String email);
  public void sendPhone(long phone);

}
