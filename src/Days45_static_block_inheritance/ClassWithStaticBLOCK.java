package Days45_static_block_inheritance;

public class ClassWithStaticBLOCK {
	
	
	static {
		System.out.println("this is static block I run  in the begining");
	}
	public ClassWithStaticBLOCK() {
		System.out.println("This is a Constructer I run every time object is created");
	}

public static void staticMethod() {
	System.out.println("this is static method");
}

}
