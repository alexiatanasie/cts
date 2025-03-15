package ro.ase.cts.models;


public class NetflixAccount {
	public static NetflixAccount instance=null;
	private NetflixAccount() {
		System.out.println("am creat un cont");
	}
	public static NetflixAccount getInstance() {
		if(instance==null) {
			instance=new NetflixAccount();
			
		}return instance;
	}
}
