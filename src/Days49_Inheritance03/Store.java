package Days49_Inheritance03;
/*
 * 3 constructors:
	 * 	1. accepts type.  
		  prints "Store constructor with Type: " + type	
	 *  2. accepts rent  
	 *  	  prints "Store constructor with rent: " + rent	

	 *  3. accepts type and rent
	 *  	  prints "Store constructor with Type: " + type +" and rent: " + rent	

	 */
 
public class Store {
private String type;

private double rent;

public Store(String type) {
	this.type=type;
	System.out.println(" strore constructer with type  is " + type);
}

public Store(double rent) {
	System.out.println(" strore constructer with rent  is " + rent);
	
	this.rent=rent;
}
public Store(String type,double rent) {
	System.out.println(" strore constructer with type" + type + "and rent " + rent);
	this.type=type;
	this.rent=rent;
}

public String getType() {
	return type;
	
}

public void setType(String type) {
	this.type = type;
}

public double getRent() {
	return rent;
}

public void setRent(double rent) {
	this.rent = rent;
}


}
