package flyweight.flyweightEX1;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String,TreeTypeConcrete> treeMap=new HashMap<>();
    public static Tree getTreeType(String name,String color,String texture){
        String key=name+" " + color+" "+texture;
        TreeTypeConcrete treeTypeConcrete=treeMap.get(key);
        if(treeTypeConcrete==null){
            treeTypeConcrete=new TreeTypeConcrete(name, color, texture);
            treeMap.put(key,treeTypeConcrete);
        }
        return treeTypeConcrete;
    }

}
