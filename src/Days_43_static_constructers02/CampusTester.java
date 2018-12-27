package Days_43_static_constructers02;

public class CampusTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Campus.city="McLean";
Campus.aboutCampus();
Campus c=new Campus();
System.out.println(c.city);
c.aboutCampus();
	}

}
