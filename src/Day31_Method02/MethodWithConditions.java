package Day31_Method02;

import java.util.Arrays;

public class MethodWithConditions {

	public static void main(String[] args) {
		// create method get larger one if they are equal print one of them
		getLarger(100,400);
		
		int[] arr= {100,245,12};
		getMax(arr);//
		//getMax(new int[]{346,2455,12 }); Another way
		//new int[0] emty array
		//
		steps(-3);
		
	}
	public static void getMax(int[] nums) {
		
			if(nums.length==0) {
				System.out.println("Error Arrays is empty");
				return;
			}
			Arrays.sort(nums);
			System.out.println(nums[nums.length-1]);
		}
	
	public static void steps(int times){
		
		if(times==0) {
			System.out.println("Sit");
		}
		if(times>0) {
			for(int i=1;i<=times;i++) {
				System.out.println("Steps" + i);
				
			}
				
			}else if(times<0) {
				for(int i=1;i<=times*(-1);i++) {
					System.out.println("jump" + i);
				
		}
	}
	}
	
	
		
		public static void getLarger(int num1, int num2){
	if(num1>num2) {
		System.out.println(num1);
	}else if(num2>num1) {
		System.out.println(num2);
	}else {
		System.out.println("numbers are equal"+ num1);
	}
	
}
		
		//create a method getMat -that accapts an int arrays and print larger 
		//if array is empty print Error 
	}
//create a method steps .it accepts on int parametar
//if the parameters is negative then we print "jump" that many times
//-2
//Jump1
//jump2
//if parameters is 0 "sit"
//

