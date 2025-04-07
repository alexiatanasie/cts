package en.ase.sqt.prototypeFactory;

import java.util.HashMap;
import java.util.Map;

public class GameCharacterPrototypeFactory {
    private static Map<CharacterType,GameCharacter> prototypes=new HashMap<>();
    static{

        try {
            prototypes.put(CharacterType.WARRIOR,new GameCharacter("WARRIOR", 2,999));
            prototypes.put(CharacterType.MAGE,new GameCharacter("MAGE", 4,55));
            prototypes.put(CharacterType.ARCHER,new GameCharacter("ARCHER", 7,24));

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
        public static GameCharacter getCharacters(CharacterType type) throws CloneNotSupportedException {
        GameCharacter prototype=prototypes.get(type);
        if(prototype!=null){
            return (GameCharacter) prototype.clone();
        }else{
            throw new UnsupportedOperationException("character not found");
        }
    }

}
