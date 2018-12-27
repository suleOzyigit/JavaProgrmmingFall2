package Day32_MethodWithReturn01;

public class MethodsWithReturn {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int amount=giveme5$();
		System.out.println(amount);
		//System.out.println(giveme5$());
		String president=getPresidentName();
		System.out.println(president);
		System.out.println(getFirtsName()+"_"+ getLastName() +"@gmail.com");
		//there is another way try it
	}

	public static int giveme5$() {
		int d = 5;
		return d;
	}

	public static String getPresidentName() {
		return "Donald Trump";
	}


	public static String whatisYourName() {
	 	String name = "Murodil";
		return name;
}
	//method get name  getLast
	//you will call these methodsand build an email
	//String 
	public static String getFirtsName() {
		String name="sule";
		return name;
		//you can also dirctly write the name 
		//return"sule';
	}
	public static String getLastName() {
		String last="Uslu";
		return last;
	}
	
	
	
	
	
	
	
}
