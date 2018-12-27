package Days33_MethodsWithreturn02;

public class StringMethods02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* method name countTime
 * Params;2 String 
 * return type:int 
 * count numbers of occurence of first string withinn the second string and return that caount
 * ex:
 * countTimes("java" ,"a")
 */
	System.out.println(countTime("java","a"));
	System.out.println( countTimesV3("abc1234ppo", "o") );
	}
	public static int countTime(String str1,String str2) {
		int count=0;
		for(int i=0;i<str1.length();i++) {
			if(str1.substring(i,i+1).equals(str2)) {
				count++;
			}
		
		}
		return count;
	}
	//works for just one character
	public static int countTimesV3 (String str1,String str2) {
		int len1=str1.length();
		str1=str1.replace(str2,"");
		int len2=str1.length();
		return len1-len2;
	}
	//TODO: code is not totaly done
	public static int countTimesV2(String str1, String str2) {
		String[] arr = str1.split(str2);
		
		return arr.length-1;
	}
}
