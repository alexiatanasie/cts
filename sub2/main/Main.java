package sub2.main;

import sub2.composite.IStream;
import sub2.composite.Stream;
import sub2.composite.StreamGroupComposite;
import sub2.observer.MobileApp;
import sub2.observer.NotificationService;
import sub2.observer.SmartTV;

public class Main {
    public static void main(String[] args) {
        IStream stream=new Stream("Brooklyn Nine-Nine");
        IStream stream1=new Stream("Mission Impossible");
        IStream stream2=new Stream("Fast & furious");


        IStream action=new StreamGroupComposite("Action");
        action.add(stream1);

        IStream comedy=new StreamGroupComposite("Comedy");
        comedy.add(stream);

        IStream newCategory=new StreamGroupComposite("New");
        newCategory.add(action);
        newCategory.add(comedy);

        IStream favorites=new StreamGroupComposite("Favorites");
        favorites.add(stream2);
        favorites.add(stream);

        IStream profile=new StreamGroupComposite("Profile");
        profile.add(favorites);
        profile.add(newCategory);

        System.out.println(profile.getName());

        //OBSERVER
        NotificationService notificationService=new NotificationService();

        SmartTV smartTV=new SmartTV("Philips");
        MobileApp mobileApp=new MobileApp("Samsung");
        notificationService.attach(smartTV);
        notificationService.attach(mobileApp);
        System.out.println("new notification");

        notificationService.notifyObservers("new episode");

        notificationService.detach(smartTV);
        notificationService.notifyObservers("update billing");

    }
}
