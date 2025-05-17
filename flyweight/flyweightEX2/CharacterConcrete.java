package flyweight.flyweightEX2;

public class CharacterConcrete extends CharacterSymbolAbsClass{

    public CharacterConcrete(char symbol) {
        super(symbol);
    }

    @Override
    public void display(CharacterContext context) {
        System.out.println(symbol+" "+context.getX()+ " "+ context.getY()+ " "+ context.getFont()+" "+ context.getSize());
    }

}
