package Days_43_static_constructers02;

public class Calculater {
	
	public String operation;
	
public static double plus(double num1,double num2) {
	return num1+num2;
}
public static double minus(double num1, double num2) {
	return num1-num2;
}
public  double multiply(double num1, double num2) {
	operation ="multiply";
	return num1*num2;
}

}
