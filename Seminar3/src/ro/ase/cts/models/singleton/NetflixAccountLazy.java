package ro.ase.cts.models.singleton;

import ro.ase.cts.interfaces.Netflixable;

public class NetflixAccountLazy implements Netflixable {
	private static NetflixAccountLazy instance=null;//private
	
	private NetflixAccountLazy() {
		System.out.println("lazy-am creat un cont");
	}
	public static NetflixAccountLazy getInstance() {
		if(instance ==null) {
			instance= new NetflixAccountLazy();
			
		}return instance;
	}
}
