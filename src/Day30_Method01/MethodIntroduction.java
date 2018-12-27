package Day30_Method01;

public class MethodIntroduction { 
	public static void main(String[] args) {
		sayHello();//coling sayHello method
		sayHello();
		AskHowRY();
		reply();
		sayBay();
		sayHelloTo(" Nazim");
		String nameOfFriend="Umit";
			sayHelloTo(nameOfFriend);
			
	}
	public static void sayHelloTo(String name) {
		System.out.println("Hello" + name);
		
	}
public static void sayHello() {
	System.out.println("hello");
	System.out.println("hi!");
	
	}

public static void AskHowRY() {
	System.out.println("How are you");
}
public static void reply() {
	System.out.println("I am doing well, hpw about you");
}
public static void sayBay() {
System.out.println("Bye Have a good day");	
}

	//write a method askHowRU ask "How are you"
	// write a method reply. that prints "I am doing well, hpw about you"
	//write a method sayBay that says 'Bye Have a good day
}


