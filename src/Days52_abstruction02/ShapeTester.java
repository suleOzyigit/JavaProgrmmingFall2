package Days52_abstruction02;

public class ShapeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Circle circle=new  Circle();
         circle.calculateArea();
         Regtangle regtangle1=new Regtangle("rec1",3,11);
         Regtangle regtangle2=new Regtangle("rec2",31,21);
         regtangle1.calculateArea();
         regtangle2.calculateArea();
         
         Circle circle1=new  Circle("circ1",5);
         Circle circle2=new  Circle("circ2",12);
         
         circle1.calculateArea();
         circle2.calculateArea();
         Drawable.doStaticStuff();
         
	}

}
