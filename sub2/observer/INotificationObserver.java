package sub2.observer;

public interface INotificationObserver {
    void update(String message,INotificationSubject subject);
}
