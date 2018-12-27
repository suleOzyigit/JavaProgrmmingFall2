package Day35_Marufjan;

public class SubstringWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Holloween";
        String str2="Holloween";
       int count = numberOfOccurences( str1, str2);
       System.out.println(count);
	}
	public static int numberOfOccurences(String str1, String str2) {
		int count = 0;
		for (int i = 0; i <str1.length() - str2.length()+1; i++) {
			String current = str1.substring(i, i + str2.length());
			if (current.equals(str2)) {
				count++;
			}
		}
		return count;
	}

}
