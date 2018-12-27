package Days33_MethodsWithreturn02;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(reverse("computer"));

boolean isPal=isPalidrome("level");
System.out.println(isPal);
//=============================================
//String ="java";
	}
	/* Method:Reverse
	 * Params: 1String
	 * Return type;String
	 * it reverse the param string and returns the result
	 */
	
public static String reverse(String original) {
	String reversed="";
	
	for(int i=original.length()-1;i>=0;i--) {
		reversed= reversed+original.charAt(i);
		//reversed=reversed+substring(i,i+1);
		
	}
	return reversed;
}
/* isPalindrome
 * Param:1.String 
 * return type boolean
 * if param String is palidrom returns true otherwise return false
 * 
 */
public static boolean isPalidrome(String str) {
	String reversed="";
	
	for(int i=str.length()-1;i>=0;i--){
		reversed+=str.charAt(i);
	}
	if(str.equalsIgnoreCase(reversed)) {
		return true;
	}
	return false;
}
//Version 2 of IsPloindrome that will call reverse method
public static boolean isPalindromeV2(String str) {
    //return reverse(str).equalsIgnoreCase(str);
    if(reverse(str).equalsIgnoreCase(str)) {
        return true;
    }
    
    return false;
}
}
