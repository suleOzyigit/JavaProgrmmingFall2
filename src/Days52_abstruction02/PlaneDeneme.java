package Days52_abstruction02;

public class PlaneDeneme {

public static void main(String[] args) {
		
		Drone d = new Drone();
		d.move();
		d.moveIt();
		d.fly();
		
		
		Moveable m = new Drone();
		m.move();
		
		Flyable f = new Drone();
		f.fly();
	}

}


