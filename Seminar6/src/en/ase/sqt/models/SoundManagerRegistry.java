package en.ase.sqt.models;

import en.ase.sqt.interfaces.ISoundManager;

import java.util.List;

public class SoundManagerRegistry implements ISoundManager {
    private static List<SoundManagerRegistry> instances;
    public int volume;

    private SoundManagerRegistry(){

    }
    private SoundManagerRegistry(int volume) {
        this.volume = volume;
        System.out.println("sound manager;");
    }

//    public static List<SoundManagerRegistry> getInstances() {
//        return instances;
//    }
//
//    public static void setInstances(List<SoundManagerRegistry> instances) {
//        SoundManagerRegistry.instances = instances;
//    }

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
        return "SoundManagerRegistry{" +
                "volume=" + volume +
                '}';
    }
}
