package Days39_StringBulders;

public class StringBulderExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stb1+stb2 is not worked here because + operator is not work here
		
		
StringBuilder stb1= new StringBuilder("Halloween");
System.out.println(stb1);
StringBuilder stb2= new StringBuilder();
stb2.append("java");//append means is add
System.out.println(stb2);
stb2.append(", SQL").append(", HTML");
System.out.println(stb2);
//============================
StringBuilder listBuilder=new StringBuilder("Wooden Spoon");

listBuilder.append(", iron Spoon");
System.out.println(listBuilder);
listBuilder.append('|');
System.out.println(listBuilder);
listBuilder.append(100);
System.out.println(listBuilder);
String s = "aaa";
s = s+100;
s = s + true;
s = s + '%';
System.out.println(s);
StringBuilder  letters=new StringBuilder("ABCDEFGHIJKLM");
letters.append("KKK WWW");
System.out.println(letters);
letters.delete(1,2);
System.out.println(letters);
letters.delete(0, 4);
System.out.println(letters);
//=========================
StringBuilder sentence = new StringBuilder("Sule");
sentence.reverse();

System.out.println(sentence);
//=========================
sentence.deleteCharAt(0);
System.out.println(sentence);

StringBuilder stbInsert=new StringBuilder("Selenium otamation");

// SeleniumAtamation ==>selenium test Autamation
stbInsert.insert(8, " Test ");
System.out.println(stbInsert);

stbInsert.insert(9,1);
System.out.println(stbInsert);
//==============================
//Appium=> chance selenium to Appium 
//stbInsert.replace(0,8,"Appium");
stbInsert.replace(0,stbInsert.indexOf(" "),"Appium");
System.out.println(stbInsert);

	}

}
