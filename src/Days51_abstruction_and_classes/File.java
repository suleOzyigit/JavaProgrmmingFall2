package Days51_abstruction_and_classes;

public abstract class File {
	
	private String name;
	
	public static int count;
	
	
	
	
	public   File () {
		System.out.println("File class constructer");
	
	name="unknown ";
	count++;
	}
	
	public   File (String name) {
	
		System.out.println("Files calss 1- arg constructer");
		this.name=name;
	count++;
	
	}
	
public String getName() {
		return name;
	}
public void setName(String name) {
		this.name = name;
	}


public abstract void open();


public  void close() {
	System.out.println("Closing file");
}
}
