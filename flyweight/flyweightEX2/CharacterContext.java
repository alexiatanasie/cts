package flyweight.flyweightEX2;

//extrinsic state
public class CharacterContext {
    private final String font;
    private final int x;
    private final int y;
    private final int size;

    public CharacterContext(String font, int x, int y, int size) {
        this.font = font;
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public String getFont() {
        return font;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }
}
