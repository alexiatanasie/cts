package sub2.observer;

public class MobileApp implements INotificationObserver{
    private String name;
    private String observerState;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String message, INotificationSubject subject) {
        this.observerState=message;
        System.out.println("mobile "+name+message);
        System.out.println("mobile subject "+ subject.getSubjectState());
    }
}
