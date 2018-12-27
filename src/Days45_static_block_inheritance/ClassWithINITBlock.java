package Days45_static_block_inheritance;

public class ClassWithINITBlock {
	
	{
		System.out.println("this is initializer block. I run aotomaticly every time object is created");
	}
	static {
		System.out.println("this is static method I run  one  before constructer and int");
	}
	
	
	public ClassWithINITBlock() {
		System.out.println("this is a constructer. I run aotomaticly every time object is created");
	}
	public static void staticMethod() {
		System.out.println("Ststic method");
	}
}
