package client.networking;

public interface Client {

    void startClient();
    String sendUser(User user);
    String sendProfile(Profile profile);

}
