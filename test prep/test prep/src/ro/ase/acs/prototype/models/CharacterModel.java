package ro.ase.acs.prototype.models;

import java.util.ArrayList;
import java.util.List;

public class CharacterModel implements ICharacterModel, Cloneable{
    private String name;
    private String textureFile;
    private String animationFile;
    private List<Integer> list = new ArrayList<>();

    public CharacterModel(String name, String textureFile, String animationFile) {
        this.name = name;
        this.textureFile = textureFile;
        this.animationFile = animationFile;
        System.out.println("Model created");
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTextureFile() {
        return textureFile;
    }

    public void setTextureFile(String textureFile) {
        this.textureFile = textureFile;
    }

    public String getAnimationFile() {
        return animationFile;
    }

    public void setAnimationFile(String animationFile) {
        this.animationFile = animationFile;
    }

    @Override
    public void render() {
        System.out.println("Model " + name +" is rendered");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        CharacterModel clone = (CharacterModel) super.clone();
        clone.list = new ArrayList<>(this.list);
        clone.name = this.name;
        clone.animationFile = this.animationFile;
        clone.textureFile = this.textureFile;
        return clone;
    }
}
