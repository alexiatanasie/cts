package flyweight.flyweightEX2;

import java.util.HashMap;
import java.util.Map;

public class SymbolFactory {
    private static final Map<Character,CharacterConcrete> symbolMap=new HashMap<>();
    public static CharacterSymbolAbsClass getSymbol(char c) {
        if (!symbolMap.containsKey(c)) {
            symbolMap.put(c, new CharacterConcrete(c));
        }
        return symbolMap.get(c);
    }
}
