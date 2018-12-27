package Days52_abstruction02;

public class Regtangle  extends Shape implements Drawable {
	
int width;
int height;



Regtangle(String name,int width, int height ){
super(name);
this.height=height;
this.width=width;

}
@Override
public void calculateArea() {
	// TODO Auto-generated method stub
	int result=height*width;
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