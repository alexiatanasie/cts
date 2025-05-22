package sub2.observer;

//concrete observer
public class SmartTV implements INotificationObserver{
    private String name;
    private String observerState;

    public SmartTV(String name) {
        this.name = name;
    }

    @Override
    public void update(String message, INotificationSubject subject) {
        this.observerState=message;
        System.out.println("tv "+name+message);
        System.out.println("tv subject "+ subject.getSubjectState());
    }
}
