package ro.ase.cts.models.singleton;

import ro.ase.cts.interfaces.Netflixable;

public class NetflixAccountStatic implements Netflixable {
	public static NetflixAccountStatic instance;
	
	private NetflixAccountStatic() {
		System.out.println("static-am creat un cont");
	}
	public static NetflixAccountStatic getInstance() {
		return instance;
	}
}
