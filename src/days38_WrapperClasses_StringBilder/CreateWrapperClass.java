package days38_WrapperClasses_StringBilder;

public class CreateWrapperClass {

	public static void main(String[] args) {
		// Creating wrapper class
//Integer n1=new Integer(100);
//Integer n2=Integer.valueOf(400);
//Integer n3= Integer.parseInt("100");// conver string to integer
//Double d1=new Double(123.45);
//Double d2=Double.valueOf(234);
//Double  d3= Double.parseDouble("100.5");
//Character ch1=new Character('A');
//Character ch2= Character.valueOf('@');
char ch3='5';
System.out.println(Character.isDigit(ch3));
String str="ab51";
System.out.println(Character.isAlphabetic(str.charAt(0)));
System.out.println(Character.isAlphabetic(str.charAt(2)));
System.out.println(Character.isUpperCase(str.charAt(0)));
System.out.println(Character.isLetterOrDigit(str.charAt(4)));
	}

}
