package Days46_this_isa;

public class Calctest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calc c=new Calc();
c.plus(10);
System.out.println(c.getResult());
c.plus(10).plus(15+15).plus(10).plus(3).minus(3);
System.out.println(c.getResult());
	}

}
