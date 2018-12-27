package Days41_classes02_Encapsulation;

public class HouseTester {

	public static void main(String[] args) {
		// Step1 .Create House object and assing data to field/ins variable
	House yourHouse=new House();
	yourHouse.type="Castle";
	yourHouse.address= "100 Masacuses ave ,Washington Dc";
	yourHouse.bedrooms=250;
	yourHouse.year=2018;
	
	printHouseInfo(yourHouse);
	House myHouse=new House();
	
	myHouse.type="not Castle";
	myHouse.address= "110 C st ,Washington Dc";
	myHouse.bedrooms=5;
	myHouse.year=2017;
	
	printHouseInfo(myHouse);
	
	
	House returnHouse=buildHouse("Loft","777 Wooden Spoon Lane  New York", 2,1999);
	System.out.println(returnHouse.address);
	System.out.println(returnHouse.type);
	
	printHouseInfo(returnHouse);//tekrar et
	
	
	}
	public static void printHouseInfo(House houseObj) {
		System.out.println("===========");
		System.out.println("Type: " + houseObj.type);
		System.out.println("Address: " + houseObj.address);
		System.out.println("Bedrooms #: " + houseObj.bedrooms);
		System.out.println("Year: " + houseObj.year);
		System.out.println("============");
		
		
		
		/*create method to build a house
		 * Parameters:2 String /2 int 
		 * return type House
		 * int the method using the values of the parameters build a new object
		 * then return that
		 * 
		 * 
		 */
		
		
	}
public static House buildHouse(String type, String address, int rooms, int year){
		
		House newHouse=new House();
		newHouse.type = type;
		newHouse.address = address;
		newHouse.bedrooms = rooms;
		newHouse.year = year;
		
		return newHouse;
		}
}
