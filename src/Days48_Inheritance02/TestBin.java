package Days48_Inheritance02;

public class TestBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bin yourBin=new Bin();
System.out.println(yourBin.toString());

yourBin.add("book");
yourBin.add("notebook");
yourBin.add("ipad");
System.out.println(yourBin.toString());
yourBin.remove("BOOk");
System.out.println(yourBin.toString());

RecyleBin rBin=new RecyleBin();
rBin.add("Bottle");
System.out.println(rBin);





	}

}
