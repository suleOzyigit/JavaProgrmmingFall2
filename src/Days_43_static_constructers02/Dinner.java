package Days_43_static_constructers02;

public class Dinner {
public static int pizzaSlices=8;
public void takeASlice() {
	pizzaSlices--;
	
}
public void takeASlice(int num) {
	pizzaSlices-=num;
}
}
