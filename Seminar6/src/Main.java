import en.ase.sqt.models.SoundManager;

// EAGER => private static SoundManager instance=new SoundManager();
//nu e nevoie de thread
//LAZY  => private static SoundManager instance; si cu if(instance==null)

public class Main {
    public static void main(String[] args) {

        System.out.println("the app is starting");
        for(int i=0;i<10;i++){
            new Thread(new Runnable(){

                @Override
                public void run() {
                    SoundManager sm1=SoundManager.getInstance();
                }
            }).start();
        }
        SoundManager sm1=SoundManager.getInstance();
        sm1.volume=77;
        System.out.println(sm1);
        SoundManager sm2=SoundManager.getInstance();
        sm2.volume=99;
        System.out.println(sm1);

       // sm2.clone(); deci daca am eroare in clone,e singleton parca

        System.out.println(sm1);
        System.out.println(sm2);
    }
}