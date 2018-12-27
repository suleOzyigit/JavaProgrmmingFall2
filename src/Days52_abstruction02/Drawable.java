package Days52_abstruction02;
////Task 2 
//Create an interface called Drawable
//with constant COLOR 
//and abstract method draw() return nothing
//another abstract method drawLine , 
//have one parameter direction : String 
//return int 
//Let the rectangle class implements this interface 



public interface Drawable {
	public static final String COLOR= "red";
	public abstract void draw();
	public abstract void drawLine(String s);
	//void drawSquare();
	public default void drawSquare() {
		System.out.println("I will wait for your implementation");
	}
public static void doStaticStuff() {// we can not override static method
	System.out.println("it is static");
}
}
