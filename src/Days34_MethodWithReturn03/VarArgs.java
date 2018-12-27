package Days34_MethodWithReturn03;

public class VarArgs {
	public static void main(String[] args) {
		sum(10,20);
		sumAll();
		sumAll(10);
		sumAll(12,34,45,67);
		shoppingList("apples","kivi","banana","orang");
	}
public static void sum(int num1, int num2) {
	System.out.println(num1+num2);
}
public static  void sumAll(int...nums) {//I can say boolean ...
	//var args have to be in midde all the time
	System.out.println("number of input" +nums.length);
	int sum=0;
	for(int num:nums) {
		sum+=num;
	}
	System.out.println("sum" +sum);
}
/* Methods shopping list that has varargs
 * Args String varargs
 * return type:Void
 * it will print shopping items in single line,seperated
 */
public static void shoppingList(String...list) {
	System.out.print("Shopping list:");
	for(String item:list) {
	System.out.print(" "+ item);
	//String myList="apples","kivi" "banana";
}	
	System.out.println();
}

}
