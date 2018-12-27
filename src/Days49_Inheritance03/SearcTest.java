package Days49_Inheritance03;

public class SearcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearcEngine src=new SearcEngine();
		
		src.search("Iphone charger");
		Google google= new Google();
		google.search("leptop");
		Etsy etsy = new Etsy();
		etsy.search("wooden spoon");
	}

}
