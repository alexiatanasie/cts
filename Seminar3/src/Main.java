//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import ro.ase.cts.interfaces.Netflixable;
import ro.ase.cts.models.singleton.NetflixAccountEager;
import ro.ase.cts.models.singleton.NetflixAccountLazy;
import ro.ase.cts.models.singleton.NetflixAccountLazyThread;
import ro.ase.cts.models.singleton.NetflixAccountStatic;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Netflixable account=null;
		for(int i=0;i<5;i++) {
			account=NetflixAccountEager.getInstance();
			account = NetflixAccountStatic.getInstance();
		}
		for(int i=0;i<5;i++) {
			new Thread(()->{System.out.println("THREAD");
			Netflixable threadAcc=NetflixAccountLazy.getInstance();//not thread safe
			System.out.println("THREAD\n");
			}).start();
		}
		Thread.sleep(1000);
        System.out.println("______________________________________________________\n");
        
        for(int i=0;i<5;i++) {
			new Thread(()->{System.out.println("THREAD");
			Netflixable threadSafeAcc=NetflixAccountLazyThread.getInstance();//not thread safe
			System.out.println("THREAD\n");
			}).start();
		}
	}
}
