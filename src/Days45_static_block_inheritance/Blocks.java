package Days45_static_block_inheritance;

public class Blocks {

	static int num=100;
	
	static String str;
	static {
		
		System.out.println("static block");
        num+=1000;
        str="Hello";
    }
    
    {
        num+=500;
        str+=" world";
    }
    
    public Blocks() {
    	System.out.println("static constrructer");
        num*=2;
        str+="!!!";
    }
}
