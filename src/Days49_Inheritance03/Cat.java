package Days49_Inheritance03;

public class Cat extends Animal{
public Cat() {
	super("pissy");//even if we do not put super here class will call parents class's 
	//constructer but super is also another way to call constructer
	System.out.println("Cat object is created");
}
@Override
public void speak() {
	System.out.println("Cat is Speaking samehow");
}
}
