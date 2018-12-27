package Days49_Inheritance03;

public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Strore store1=new Store(); it is not going to work because we need a constructure with arg
		Store store1= new Store("grocery");
		Store store2= new Store(100000.0);
		Store store3= new Store("Pet store", 45523.50);
	System.out.println("=====pet store  with object===");
	 
	PetSmart petSmart1=new PetSmart();
	
	
	System.out.println("=====pet store  with  rent object===");
	 
	PetSmart petSmart2=new PetSmart(1233.00);
	
	
	System.out.println("Pet Smart type:" + petSmart1.getType());
	System.out.println("Pet Smart rent:" + petSmart1.getRent());
	
	
	System.out.println(" pet store 2");
	System.out.println("Pet Smart type:" + petSmart2.getType());
	System.out.println("Pet Smart rent:" + petSmart2.getRent());
	
	}

}
