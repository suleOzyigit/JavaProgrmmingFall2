package Days40_CostumClass;

import java.util.Arrays;

public class ArrayToStb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String []words=new String[5];
words[0]= "coffee";
words[2]= "tea";
words[3]= "water";
words[4]= "juice";
words[1]= "milk";
System.out.println(Arrays.toString(words));
// create string builder
StringBuilder wordsStb=new StringBuilder();
//without loop if you have fixed number of values in string[]
wordsStb.append(words[0])
.append(words[1])
.append(words[2])
.append(words[3])
.append(words[4]);
	System.out.println(wordsStb + " ");
	//do with  loop
	StringBuilder wordsBuilder=new StringBuilder();
	for(String drink:words) {
		wordsBuilder.append(drink);
	}
	System.out.println(wordsBuilder + " ");	
	}

}
