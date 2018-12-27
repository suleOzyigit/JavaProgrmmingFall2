package Days40_CostumClass;

public class MovieTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Movie m1=new Movie();
Movie m2=new Movie();
Movie m3=new Movie();
m1.name="internship";
m2.name="Galadioter";
m3.name=" StarWars";
m1.length=119;
m2.length=140;
m3.length=150;

m1.wathc();
m2.wathc();
m3.wathc();
m1.buy(10.77);
m2.buy(23.56);
m3.buy(22.0);
	}


}
