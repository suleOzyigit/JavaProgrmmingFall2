package Day35_Marufjan;

public class MethodAndStaff {

	public static void main(String[] args) {
		// TODO Auto-generated metho
//		String str="laptop";
//		// delete a
//		str=delete(str,"a");
//		System.out.println(str);
//		String str = "bless you";
//        str = delete(str, "you");
//        System.out.println(str);
        String str1="Holloween";
        String str2="n";
       int count = numberOfOccurance( str1, str2);
       System.out.println(count);

	}
/*delete utility 
 * will delete a given character from the given  charactor from the given string
 * givin a string write a method which returns 
 *  haw many  times a certain character appears on string
 * 
 * 
 */
	public static String delete(String str1,String str2) {
		//String newOne=str1.replace("a","");
		//return  newOne;
		String newOne = str1.replace(str2, "");
        return newOne;
	}
	public static  int  numberOfOccurance(String str1, String str2) {
		int count=0;
		
		for(int i=0;i<str1.length()-1;i++) {
		String currentChar=""+str1.charAt(i)+str1.charAt(i+1);
		 if(currentChar.equals(str2)) {
			 count++;
			 
		 }
		
	}
		return count;
	}

}
