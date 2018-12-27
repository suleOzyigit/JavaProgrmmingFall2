package Days39_StringBulders;

public class AppendAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char ch='A';
ch++;
System.out.println(ch);

StringBuilder builder = new StringBuilder();
for(char chars='A'; chars<='Z'; chars++) {
	//System.out.println(chars);
	builder.append(chars);
}
System.out.println(builder);
	}

}
