package flyweight.flyweightEX2;

public abstract class CharacterSymbolAbsClass {
    protected final char symbol;

    protected CharacterSymbolAbsClass(char symbol) {
        this.symbol = symbol;
    }
    public abstract void display(CharacterContext context);
}
