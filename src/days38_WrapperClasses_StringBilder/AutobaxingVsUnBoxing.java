package days38_WrapperClasses_StringBilder;

import java.util.ArrayList;
import java.util.List;

public class AutobaxingVsUnBoxing {

	public static void main(String[] args) {
		// Auto boxing. take primitive and convert into wrappre class
		int i=100;
		Integer j=i;//Auto boxing
		
Double d=34.4;//Auto boxing
boolean b=true;
Boolean b2=b;
List<Integer>nums=new ArrayList<>();
nums.add(433);
int p=555;
nums.add(p);
nums.add(new Integer(77));//there is no Aoutboxing
System.out.println(nums);
int r=nums.get(0);//unboxing ..>taking wrapper class object and converting into primitive and it happens automaticly
Boolean bool=new Boolean(true);
boolean boolPrim=bool;
System.out.println(boolPrim);
Character chobj='^';//Autobaxing
char chPrim=chobj;//unBoxing
Character char3= new Character('-');//nothing happens
char ch7=char3;//unbox
Integer intValue=new Integer(400);
int intPrimitive=400;
if(intValue==400) {//unBoxing  => intValue is unBox to primitive
	System.out.println("pass");
}else {
	System.out.println("false");
}

	}

}
