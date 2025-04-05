package en.ase.sqt.prototype;

public class Sticker implements ISticker,Cloneable{

    private String designName;
    private Sticker(){
            super();
    }
    public Sticker(String designName){
        this.designName=designName;
        try {
            System.out.println(" sticker design: " + designName);
            Thread.sleep((int)(Math.random() * 50 + 50) * 100); //50-100 min
            System.out.println("Design " + designName + " generated.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void print() {
        System.out.println("The sticker has desing:"+designName);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Sticker clone=(Sticker) super.clone();
        clone.designName=this.designName;
        return clone;
    }
}
