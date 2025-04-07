package en.ase.sqt.singleton;

public abstract class AbstractSensorSystem {
    protected String location;

    public AbstractSensorSystem(String location) {
        this.location = location;
        System.out.println("show location");
    }
    public abstract void readData();
}
