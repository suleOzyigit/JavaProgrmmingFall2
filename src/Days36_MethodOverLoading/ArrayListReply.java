package Days36_MethodOverLoading;

import java.util.Arrays;

public class ArrayListReply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Method name:addElements 
 * args: 2 int arrays
 * return: int array
 * Add each element value of args arrays and returns a new array
 * each arg array has 5 elements
 */int [] arr1= {4,5,6,7,8};
   int[] arr2= {1,2,6,3,6};
   //another way
   //arr3 =addElements(new int[] {4,5,3,1,3} , new int[] {1,2,3,4,5});
//System.out.println( Arrays.toString(arr3) );
		
		
		int [] arr3=addElements(arr1,arr2);
		System.out.println(Arrays.toString(arr3));
	}
	public static int []addElements(int[] ints1,int[]ints2){
		// create new array
		int [] newArr=new int[ints1.length];
		for(int i=0;i<newArr.length;i++) {
		newArr[i]=ints1[i]+ints2[i];
		}
		return newArr;
	}
}

