package flyweight.flyweightEX2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text="Alexia invata flyweight la software quality";
        List<CharacterSymbolAbsClass>list=new ArrayList<>();
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);

            CharacterSymbolAbsClass symbolAbsClass=SymbolFactory.getSymbol(c);
            list.add(symbolAbsClass);

            CharacterContext ctx=new CharacterContext("arial",i*10,33,12);
            symbolAbsClass.display(ctx);
        }
    }
}
