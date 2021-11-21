package util;

import java.beans.PropertyChangeListener;

public interface PropertyChangeSubject {

    void addPropertyListener(String eventName, PropertyChangeListener listener);
    void removePropertyListener(String eventName, PropertyChangeListener listener);
}
