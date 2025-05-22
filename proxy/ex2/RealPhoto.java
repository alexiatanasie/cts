package proxy.ex2;

public class RealPhoto extends Photo{

    public RealPhoto(String name) {
        super(name);
    }
    private void loadImage(){
        System.out.println("loading image "+name);
    }
    @Override
    public void display() {
        System.out.println("display image "+name);

    }
}
