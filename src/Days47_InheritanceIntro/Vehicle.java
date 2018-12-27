package Days47_InheritanceIntro;

public class Vehicle {

	public String makeAndModel;
	public int year;
	public int maxSpeed;
	public int milage;
	public static void service() {
		System.out.println("Vehicle has service");
	}
	
	public void drive() {
		System.out.println("Driving");
	}
public void stop() {
	System.out.println("Stopping");
}
}
