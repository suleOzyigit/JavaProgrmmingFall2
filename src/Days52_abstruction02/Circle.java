package Days52_abstruction02;


////Task 2 
//Create an interface called Drawable
//with constant COLOR 
//and abstract method draw() return nothing
//another abstract method drawLine , 
//have one parameter direction : String 
//return int 
//Let the rectangle class implements this interface 


public class Circle extends Shape implements Drawable {
int radius;
Circle(){
	super("");
}

	Circle(String name,int radius) {
		super(name);
		this.radius=radius;
		
	}

	@Override
	public void calculateArea() {
		int result=(int)3.14*radius*radius;
		System.out.println(result);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawLine(String s) {
		// TODO Auto-generated method stub
		
	}

}
