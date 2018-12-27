package Days37_ArrayLists;
import java.util.*;
public class ArrayListUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> nums=new ArrayList<>();
nums.add(100);
nums.add(200);
nums.add(300);
nums.add(400);
nums.add(500);
System.out.println(nums);
//update 100 to 1000
nums.set(0, 1000);
System.out.println(nums);
//double the value of index1
nums.set(1, nums.get(1)*2);
System.out.println(nums);
// find the position of 300 make it 3
int value=nums.indexOf(300);
nums.set(value,3);
System.out.println(nums);
	}

}
