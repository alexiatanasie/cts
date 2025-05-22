package proxy.ex2;

public abstract class Photo {
    protected String name;

    public abstract void display();

    public Photo(String name) {
        this.name = name;
    }
}
