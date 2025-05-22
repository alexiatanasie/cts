package proxy.ex2;

public class ProxyPhoto extends Photo {
    private RealPhoto realPhoto;

    public ProxyPhoto(String name) {
        super(name);
    }

    @Override
    public void display() {
        if(realPhoto==null){
            realPhoto=new RealPhoto(name); //lazy loading
        }
        realPhoto.display();
    }


}
