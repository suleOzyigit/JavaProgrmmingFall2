package Days46_this_isa;

public class HasARelationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Engine carEngine=new Engine();
carEngine.cylinders=4;
carEngine.horsepower=234;
Car car=new Car();
car.model="Toyota Camry";
car.engine=carEngine;
System.out.println(car.model);
System.out.println(car.engine.cylinders);
Car car2=new Car();
car2.model="BMW";
car2.engine=new Engine();
car2.engine.cylinders=6;
car2.engine.horsepower=500;



//Car car3=new Car();
//car2.engine=new Engine(8,687);
//car3.model="audi";
//System.out.println(car3.model+" " + car3.engine.cylinders+" "+ car3.engine.horsepower);
	}

}
