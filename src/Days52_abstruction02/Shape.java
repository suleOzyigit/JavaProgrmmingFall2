package Days52_abstruction02;

public abstract class Shape implements Drawable {
String name;
 Shape(String name){
	 this.name=name;
	 
	 
 }
 public abstract void calculateArea();
}
