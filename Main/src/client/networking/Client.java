package client.networking;

import shared.Profile;
import shared.User;
import util.PropertyChangeSubject;

public interface Client extends PropertyChangeSubject {

    void startClient();
    String sendUser(User user);
    String sendProfile(Profile profile);

}
