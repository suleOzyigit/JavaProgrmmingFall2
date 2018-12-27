package Days36_MethodOverLoading;

import java.util.ArrayList;

public class ArrayListGeneral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list=new ArrayList();//create a general (raw type) arraylist we can add ony type of data in this list
	list.add("java");
	list.add(346);
	list.add(true);
	System.out.println(list);
	list.add("sule");
	list.add("study");
	list.add('-');
	System.out.println(list);
	System.out.println(list.get(0));//index veriyor
	System.out.println(list.size());//length veriyor
	System.out.println("===============");
	ArrayList mylist=new ArrayList();
	mylist.add(134);
	mylist.add("sule");
	System.out.println(mylist);
	System.out.println(mylist.get(1));
	System.out.println(mylist.size());
	}

}
