package en.ase.sqt.singleton;

public class WeatherSensor extends AbstractSensorSystem{

    public WeatherSensor(String location){
        super(location);
    }
    @Override
    public void readData() {
        System.out.println("weather sensor: 21");
    }
}
