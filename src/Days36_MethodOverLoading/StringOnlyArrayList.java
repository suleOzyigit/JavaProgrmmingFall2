package Days36_MethodOverLoading;

import java.util.ArrayList;

public class StringOnlyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList<String> names;
//names=new ArrayList<>();;
ArrayList<String> names=new ArrayList<>();//second way
names.add("Ali");
names.add("Cam");
names.add("Anastasia");
System.out.println(names);
//get size of elements
int length=names.size();
System.out.println("Number of Names=" + length);
//read first name
String first=names.get(0);
System.out.println("First name" + first);
String last=names.get(names.size()-1);
System.out.println("last" + last);
names.remove(0);//or names.remove("Ali");
System.out.println(names);
System.out.println(names.toString());//second way
	}

}
