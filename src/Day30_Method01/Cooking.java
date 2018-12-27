package Day30_Method01;

public class Cooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cook("Steak");
		youWillNeed("meat, oil ,salt,paper");
		cookFor(10," Grilling" );
		ready();

	}
	public static void cook(String foodname) {
		System.out.println("Today we are cooking" + foodname + " ");
		
	}
	public static void youWillNeed(String items) {
		System.out.println("we need fallowing items " + items + " ");
	}
	public static void cookFor(int minutes,String wayOfCooking ) {
		System.out.println("You need to cook for " + minutes + " minutes by" + wayOfCooking);
	}
	public static void ready() {
		System.out.println("Meal is ready enjoy");
		
	}
}
//method cook accepts String food name and print 
//"Today we are cooking  foodName"
//method youWillNeed, accepts a Strins with thing we need
//prints "we need fallowing items"
//method cookFor accepts minutes and prints and way of cooking and prints
//"You need to cook minutes by means of wayOfCooking"
//method called ready does not accepts any parameters and prints 
//"Meal is ready enjoy"