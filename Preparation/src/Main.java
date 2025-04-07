import en.ase.sqt.prototypeFactory.CharacterType;
import en.ase.sqt.prototypeFactory.GameCharacter;
import en.ase.sqt.prototypeFactory.GameCharacterPrototypeFactory;
import en.ase.sqt.singleton.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

        //prototype factory
        GameCharacter gameCharacter=new GameCharacter("Mirel",1,22);
        GameCharacter g1= (GameCharacter) gameCharacter.clone();
        GameCharacter g2= (GameCharacter) gameCharacter.clone();
        gameCharacter.display();
        g1.display();
        g2.display();


        GameCharacter g3= GameCharacterPrototypeFactory.getCharacters(CharacterType.ARCHER);
        g3.display();

        //EAGER
        EAGERWeatherStation eager=EAGERWeatherStation.getInstance();
        EAGERWeatherStation eager1= EAGERWeatherStation.getInstance();
        eager.display();
        eager1.display();
        //LAZY
        LAZYCWeatherCondition lazy=LAZYCWeatherCondition.getInstance();
        lazy.display();
        //THREAD SAFE
        THREADSAFELAZY thread=THREADSAFELAZY.getInstance();
        THREADSAFELAZY thread1=THREADSAFELAZY.getInstance();
        THREADSAFELAZY thread2=THREADSAFELAZY.getInstance();
            for(int i=0;i<3;i++){
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        THREADSAFELAZY threadsafelazy=THREADSAFELAZY.getInstance();
                    }
                }).start();
            }
        //REGISTRY
        SensorRegistry traffic=SensorRegistry.getInstance(SensorType.TRAFFIC);
        SensorRegistry air= SensorRegistry.getInstance(SensorType.AIR_QUALITY);
        traffic.display();
        air.display();

        //ABSTRACT
        AbstractSensorSystem abstractSensorSystem=new WeatherSensor("NY");
        abstractSensorSystem.readData();

    }
}