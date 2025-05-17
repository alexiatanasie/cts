package flyweight.flyweightEX1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TreeLocation>treeList=new ArrayList<>();
        for(int i=0;i<5000;i++){
            treeList.add( new TreeLocation(i*2,i*3,50+i%100));

        }
        Tree pine=TreeFactory.getTreeType("pine","brown","pine texture idk");
        for(int i=200;i<5000;i++){
            pine.displayLocation(treeList.get(i));
        }
    }
}
