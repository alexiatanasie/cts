package en.ase.sqt.singleton;

public class THREADSAFELAZY implements SensorSystem{
    private static THREADSAFELAZY instance=null;
    private THREADSAFELAZY(){
        System.out.println("weather system thread");
    }
    public static synchronized  THREADSAFELAZY getInstance(){
        if(instance==null){
            instance=new THREADSAFELAZY();
        }return instance;
    }
    @Override
    public void display() {
        System.out.println("display ");
    }
}
