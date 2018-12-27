package Days50_final_super_abstruction;

public class Product {
private String name;


public static final boolean IS_AVAIABLE=true;





public Product() {
	name="unknown";
}
  

public String getName() {
	return name;
}
public Product (String name) {
	
	this.name=name;
}



public void setName(String name) {
	this.name = name;
}
public String toString() {
	return "Name:" +name;
}
public void buy() {
	System.out.println("buying  product" + name);
}
}
