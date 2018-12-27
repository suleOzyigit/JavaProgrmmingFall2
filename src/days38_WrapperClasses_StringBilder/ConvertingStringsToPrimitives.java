package days38_WrapperClasses_StringBilder;

import java.util.ArrayList;

public class ConvertingStringsToPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String count="432";
int icount=Integer.parseInt(count);// convert string to integer
System.out.println(icount);
if(icount>0) {
	System.out.println("Count is positive");
}else {
	System.out.println("Count is negative");
}
String str="price is 45.6";
String []sp=str.split(" ");
Double   price=Double.parseDouble(sp[2]);
System.out.println(price);
String etsyResult = "”wooden spoon” (13,950 Results)";
String [] etsyArray=etsyResult.split(" ");
String strSpoonCount=etsyArray[2].replace("(","").replace(",","");
int woodenSpoons=Integer.parseInt(strSpoonCount);
System.out.println(woodenSpoons);
if(woodenSpoons > 0) {
    System.out.println("PASS. Search results are displayed");
}else {
    System.out.println("FAIL. Search results are NOT displayed");
}

String[] sNums = {"234", "345", "23", "12"};
ArrayList<Integer> listNums = new ArrayList<>();

for (String num : sNums) {
    listNums.add(Integer.valueOf(num));
}

System.out.println(listNums);

}
	}


