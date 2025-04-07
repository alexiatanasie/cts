package en.ase.sqt.singleton;

public class EAGERWeatherStation implements SensorSystem{
   private static final EAGERWeatherStation instance=new EAGERWeatherStation();
    private EAGERWeatherStation(){
        System.out.println("weather station initialized");
    }

    @Override
    public void display() {
        System.out.println("display");
    }
     public static EAGERWeatherStation getInstance(){
        return instance;
     }
}
