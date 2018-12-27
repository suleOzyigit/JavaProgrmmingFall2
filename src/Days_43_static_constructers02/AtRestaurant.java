package Days_43_static_constructers02;

public class AtRestaurant {

	public static void main(String[] args) {
		
Dinner Dad=new Dinner();
Dinner Mom=new Dinner();
Dinner Kid=new Dinner();
System.out.println("Pizza slices:"+ Dinner.pizzaSlices);
Dad.takeASlice(2);
Kid.takeASlice(3);
Mom.takeASlice();
System.out.println("==========");
System.out.println("Pizza slices:"+ Mom.pizzaSlices);
System.out.println("Pizza slices:"+ Dad.pizzaSlices);
System.out.println("Pizza slices:"+ Kid.pizzaSlices);
System.out.println("Pizza slices:"+ Dinner.pizzaSlices);
System.out.println("==========");
Mom.takeASlice();
Mom.takeASlice();
System.out.println(Kid.pizzaSlices);
System.out.println();
	}

}
