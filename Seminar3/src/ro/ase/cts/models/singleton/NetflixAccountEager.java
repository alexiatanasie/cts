package ro.ase.cts.models.singleton;

import ro.ase.cts.interfaces.Netflixable;

public class NetflixAccountEager implements Netflixable {
	public static final NetflixAccountEager instance=new NetflixAccountEager();
	
	private NetflixAccountEager() {
		System.out.println("eager-am creat un cont");
	}
	public static NetflixAccountEager getInstance() {
		return instance;
	}
}
