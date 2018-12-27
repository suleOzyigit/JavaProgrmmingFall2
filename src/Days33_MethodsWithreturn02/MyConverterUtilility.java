package Days33_MethodsWithreturn02;

public class MyConverterUtilility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// write a method : miles to km, accepts miles and return km values
// return typ:double
	//params:1 double 
		//================second task
//method name: fahrenheitToCelcilus
//action;accepts fahrenheit and return Celcilus value
//return type;int 
//params:1int
		System.out.println(miles2Km(55.0));
		double kmValue=miles2Km(55.0);
		System.out.println(kmValue);
		int res=fahrenheitToCelcilus(72);
		System.out.println(res);
	}
public static double miles2Km(double miles) {
	double km=1.60934*miles;
	return km;	
}
public static int fahrenheitToCelcilus(int farh) {
	int celcius=(farh-32)*5/9;
	return celcius;
}
}
