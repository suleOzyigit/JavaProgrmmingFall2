package Days33_MethodsWithreturn02;

import java.util.Arrays;
import java.util.Random;

public class ArraysMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Method: getIntArray5;
 * params/args:nothing
 * return:int array
 * create an array with 5 int and assign with random numbers between 0=100
 * return that arrat
 * 
 *///Call the array and call it
		int[] myArray=getIntArray5();
		System.out.println(Arrays.toString(myArray));
	//second way
		System.out.println(Arrays.toString(getIntArray5()));
	//================================	
		int []nums1= getIntArray5();
		int []nums2= getIntArray5();
		int sumOfNums1=0;
		int sumOfNums2=0;
		for(int num:nums1) {
			 sumOfNums1+=num;
		}
		for(int num:nums2) {
			 sumOfNums2+=num;
		}
		if(sumOfNums1>sumOfNums2) {
			System.out.println("First Array sum is larger:" +sumOfNums2);
			System.out.println("second Array sum " +sumOfNums2);
		}else if(sumOfNums2>sumOfNums1) {
			System.out.println("second Array sum is larger:" +sumOfNums2);
			System.out.println("first Array sum " +sumOfNums2);
		}else {
			System.out.println("Sum of both arrays are equal. First Array: " + sumOfNums1);
			System.out.println("Second Array Sum: " + sumOfNums2);
		}
		
		//===============
		int[]nums=new int[5];
		Random rdm=new Random();
		for(int i=0;i<nums.length;i++) {
			nums[i]=rdm.nextInt(101);
		}
		System.out.println(Arrays.toString(nums));
	}
	public static int[]getIntArray5(){
		int[]nums=new int[5];
		Random rdm=new Random();
		for(int i=0;i<nums.length;i++) {
			nums[i]=rdm.nextInt(101);
		}
		return nums;
	}
	//=======================
	
	

}
