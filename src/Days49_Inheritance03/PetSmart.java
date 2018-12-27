package Days49_Inheritance03;

public class PetSmart  extends Store{
	
	public PetSmart() {
     super("Pet Store");
     System.out.println("Pet Store no args ");
	}
	public PetSmart(double rent) {
		super("PetStore",rent);
		System.out.println("PetSmart Constructer");
	}
	
}
