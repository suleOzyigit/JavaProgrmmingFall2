package Days33_MethodsWithreturn02;

import java.util.Scanner;

public class MyCalculaterV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(4,5));
		
		
		
	}
public static  double sum(double num1,double num2) {
		
		double result=num1+num2;
	     return result;
 
}
public static  double subraction(double num1,double num2) {
	
	double result=num1-num2;
     return result;

}
public static double  multiply (double num1,double num2) {
	
	double  result=num1-num2;
     return result;

}

public static  double division(double num1,double num2) {
	
	if(num2==0) {
		System.out.println("error");
		return -1;
	}else  {
		double result=num1/num2;
		return result;
	}

}
}
