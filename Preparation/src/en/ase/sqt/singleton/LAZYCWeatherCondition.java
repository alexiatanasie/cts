package en.ase.sqt.singleton;

public class LAZYCWeatherCondition implements SensorSystem{
    private static LAZYCWeatherCondition instance=null;

    private LAZYCWeatherCondition(){
        System.out.println("lazy weather condition created");
    }
    public static LAZYCWeatherCondition getInstance(){
        if(instance==null){
            instance=new LAZYCWeatherCondition();
        }return instance;
    }
    @Override
    public void display() {
        System.out.println("message");
    }
}
