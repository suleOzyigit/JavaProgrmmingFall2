package Days50_final_super_abstruction;

public class programingLanguage extends Language {
	
	// perants version of the variable is hiding here
public String name="Programing Language - Java";

public void printProgramingName() {
	System.out.println("programing L; " + name);
	//System.out.println(super.name);// calls parents version of variable and use it 
	
}
// we are hiding static method
public static void staticmethod() {
	System.out.println(" Programing language Language - static method");
	
}
}
