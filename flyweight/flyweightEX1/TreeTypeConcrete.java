package flyweight.flyweightEX1;

public class TreeTypeConcrete implements Tree {
    private final String name;
    private final String color;
    private final String texture;

    public TreeTypeConcrete(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public void displayLocation(TreeLocation location) {
        System.out.println("tree "+name+"color "+color+"texture "+ location.getX()+ " " +location.getY()+" "+location.getHealth());
    }
}
