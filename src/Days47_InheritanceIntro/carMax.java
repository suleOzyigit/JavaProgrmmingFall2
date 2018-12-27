package Days47_InheritanceIntro;

public class carMax { //extends Object/{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// create objec of Vehicle class
// instantiation of vehicle class		
		
	Vehicle vehicle=new Vehicle();
	vehicle.makeAndModel="Subaru Outback";
	
	vehicle.year=2018;
	vehicle.maxSpeed=140;
	vehicle.drive();
	vehicle.stop();
	vehicle.milage=1234;
	
	Car car=new Car();
	car.makeAndModel="Toyato Paris";
	car.year=2015;
	car.maxSpeed=120;
	car.horsePower=234;
	car.drive();
	car.stop();
	car.doUber();
	/*Vehicle .horsePower=new Vehicle is not going to vork
	 * 
	 * 
	 * 
	 */
	 System.out.println(" ===Train ====");
	 
	 Train train =new Train();
	 train.ticketPrice=23.78;
	 train.leaveStation();
	 train.makeAndModel="Cybertrain 10";
	 train.year=2018;
	 train.maxSpeed=200;
	 train.drive();
	 train.stop();
	System.out.println("ticket price" + train.ticketPrice);
	System.out.println("=====Electric car===");
	
	
	
	ElectricCar  tesla=new ElectricCar();
		tesla.makeAndModel="Tesla Model S";
	     tesla.year=2018;
	     tesla.maxSpeed=180;
	     tesla.horsePower=342;
	     tesla.drive();
	 	tesla.stop();
	 	tesla.doUber();
	 	tesla.charcing();
	 	System.out.println("==Static service====");
	Vehicle.service();
	Car.service();
	Train.service();
	vehicle.drive();
	
	}
	

}
