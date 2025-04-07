package en.ase.sqt.singleton;

import java.util.HashMap;
import java.util.Map;

public class SensorRegistry implements SensorSystem{
    private static  Map<SensorType, SensorRegistry> instances=new HashMap<>();
        static{
            instances.put(SensorType.TRAFFIC,new SensorRegistry("TRAFFIC"));
            instances.put(SensorType.AIR_QUALITY,new SensorRegistry("AIR"));
            instances.put(SensorType.NOISE,new SensorRegistry("NOISE"));

        }

    private String type;
    private SensorRegistry(String type){
        this.type=type;
        System.out.println("registry");
    }
    public static SensorRegistry getInstance(SensorType type){
        return instances.get(type);
    }
    @Override
    public void display() {
        System.out.println( "SensorRegistry{" +
                "type='" + type + '\'' +
                '}');
    }

}
