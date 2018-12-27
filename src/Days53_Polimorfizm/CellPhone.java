package Days53_Polimorfizm;

public class CellPhone  extends Phone{
	int buttunCount=20;
	boolean isTouchScreen;
	
	
	
	@Override
	
	public  void makeCall() {
		System.out.println("you can call with this cell phone="+this.buttunCount);// you dont put this
	// if you put super.buttunCount it will cal super class field
	
	}
	// only reference type decide whta can acsess
	
	public static void main(String[] args) {
		Phone p1=new CellPhone();
		
		p1.makeCall();
		System.out.println(p1.buttunCount);
		
	}
	public void callWithoutCable() {
		System.out.println("a method that cellPHone");
	}
}
