package sub2.observer;

import java.util.ArrayList;
import java.util.List;

//CONCRETE SUBJECT
public class NotificationService implements  INotificationSubject{
    private List<INotificationObserver>observers=new ArrayList<>();
    private String state="notificare ceva";

    @Override
    public void attach(INotificationObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(INotificationObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        this.state=message;
        for(INotificationObserver observer:observers){
            observer.update(message,this);
        }
    }

    @Override
    public String getSubjectState() {
        return state;
    }
}
