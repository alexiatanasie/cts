package ro.ase.csie.cts;

public class User {
	public String name;
	public boolean isAdmin;
	public int id;
	private static int counter=1; //incrementeaza de fiecare data cand apare un utilizator.genereaza un id unic, nu punem id in ctr pt ca utilizatorul ar tb sa il introduca manual
	public User(String name, boolean isAdmin) {
		this.name = name;
		this.isAdmin = isAdmin;
		this.id=counter++;
	}
	
	
}
