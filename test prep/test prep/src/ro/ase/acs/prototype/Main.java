package ro.ase.acs.prototype;

import ro.ase.acs.prototype.models.CharacterModel;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        CharacterModel model = new CharacterModel("car", "texture/car", "animation/car");
        model.setList(list);
        CharacterModel modelClone = null;
        try {
            modelClone = (CharacterModel) model.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        modelClone.setName("new car");
        modelClone.getList().add(5);
        model.render();
        modelClone.render();
        model.setName("old car");
        model.render();
    }
}
