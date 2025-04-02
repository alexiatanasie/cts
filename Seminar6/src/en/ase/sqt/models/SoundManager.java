package en.ase.sqt.models;

import en.ase.sqt.interfaces.ISoundManager;

public class SoundManager implements ISoundManager {
    private static SoundManager instance=new SoundManager();
    public int volume;

    private SoundManager(){

    }
    private SoundManager(int volume){
        this.volume=volume;
        System.out.println("sound manager;");
    }

    public static SoundManager getInstance(){
        return instance;
    }

    public static void setInstance(SoundManager instance) {
        SoundManager.instance = instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void changeVolume() {

    }

    @Override
    public String toString() {
        return "SoundManager{" +
                "volume=" + volume +
                '}';
    }
}
