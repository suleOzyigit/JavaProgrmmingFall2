package Days_54;

public class Person {
	// POJO -- PLAIN OLD JAVA OBJECT	
		// INSTANCE FIELDS : GETTER SETTERS , CONTRUCTOR , toString 
		
		private String name ; 
		private int age ; 

		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
		// Create MainRunner class with main method
	// create a method printPerson that take object return nathing 
		//Create overloading that take object 
		//in main method 
		//create  a person object with object references 
		//create  a person object with person references 
		// try to pass your object to the method and see which one 
		// will be called 
		
		// OPTIONAL : inside your second method try to access
		// person related methods other than toString 
		
		
	}
 
