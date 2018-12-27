package Days45_static_block_inheritance;

public class DefaultValues {
	public  int intValue;
	public byte byteValue;
	public double doubleValue;
	public boolean booleanValue;
	public char charValue;
	public String stringValue;
	public Integer integerObject;
	
	

	public static void main(String[] args) {

		DefaultValues d =new DefaultValues();
		
		System.out.println(d.intValue);
		System.out.println(d.byteValue);
		System.out.println(d.doubleValue);
		System.out.println(d.booleanValue);
		System.out.println(d.charValue);
		System.out.println(d.stringValue);//null
		System.out.println(d.integerObject);//null
	
		//System.out.println(d.stringValue.toUpperCase());// it is going to make problem ecause ther is nothing inside of in it
		
		d.stringValue="Hello word";
		System.out.println(d.stringValue.toUpperCase());
	}
}
	

