package flyweight.flyweightEX1;

//extrinsicState

public class TreeLocation {
    private int x;
    private int y;
    private final int health;

    public TreeLocation(int x, int y, int health) {
        this.x = x;
        this.y = y;
        this.health = health;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHealth() {
        return health;
    }
}
