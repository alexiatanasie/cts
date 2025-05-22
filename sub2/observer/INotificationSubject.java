package sub2.observer;

public interface INotificationSubject {
    void attach(INotificationObserver observer);
    void detach(INotificationObserver observer);
    void notifyObservers(String message);

    String getSubjectState();//optional to expose some internal state
}
