package Days50_final_super_abstruction;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product p1=new Product("Sony Play Station");
System.out.println(p1);
System.out.println(p1.toString());
Electronics el = new Electronics("Dyson vacuum", 450.68);

System.out.println(el.toString());
el.buy();


System.out.println(Product.IS_AVAIABLE);

System.out.println(Product.IS_AVAIABLE);
	}

}
