package en.ase.sqt.prototypeFactory;

public class GameCharacter implements Cloneable{
    String name;
    int level;
    int healthPoints;

    public GameCharacter(String name,int level, int healthPoints) throws InterruptedException {
        Thread.sleep(2000);
        this.name = name;
        this.level = level;
        this.healthPoints = healthPoints;
        System.out.println("character created");
    }
    public void display(){
        System.out.println(name+" "+level+" "+healthPoints);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
