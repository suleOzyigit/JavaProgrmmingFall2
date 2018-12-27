package Days36_MethodOverLoading;

import java.util.ArrayList;

public class WrapperArrayListValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


ArrayList <Integer> nums=new ArrayList<>();
nums.add(300);
nums.add(500);
nums.add(1234);
nums.add(400);
System.out.println(nums);
System.out.println(nums.toString());
//for each loop
for(Integer num:nums) {
	System.out.println(num);
	System.out.println("======");
	
}
for(int num:nums) {
	System.out.println(num);
}
// print each valu with for loop
System.out.println("*********");
for(int i=0;i<nums.size();i++) {
	System.out.println(nums.get(i));
	
}
	}

}
