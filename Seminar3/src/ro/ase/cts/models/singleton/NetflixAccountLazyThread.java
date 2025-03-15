package ro.ase.cts.models.singleton;

import ro.ase.cts.interfaces.Netflixable;

public class NetflixAccountLazyThread implements Netflixable {
	private static NetflixAccountLazyThread instance=null;//private
	
	private NetflixAccountLazyThread() {
		System.out.println("lazy-am creat un cont");
	}
	public static NetflixAccountLazyThread getInstance() {
	    if (instance == null) { 
	        synchronized (NetflixAccountLazyThread.class) { 
	            if (instance == null) { 
	                instance = new NetflixAccountLazyThread();
	            }
	        }
	    }
	    return instance;
	}

}
