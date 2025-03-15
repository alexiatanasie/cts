package ro.ase.csie.cts;
//model pt task-uri
public class Task {
	public String title;
	public String description;
	public int userId;
	public int id;
	public boolean isHidden;
	private static int counter=1;
	public Task(String title, String description, int userId) {
		this.title = title;
		this.description = description;
		this.userId = userId;
		this.id=counter++;
		this.isHidden=false;
	}
	
	
}
