package Days_43_static_constructers02;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AppUser user1 = new AppUser("ironman", "Mark Smith", "ac124");
		AppUser user2 = new AppUser("postman", "Sar Sma", "a234124");
		AppUser user3 = new AppUser("superman", "Hi Joe", "fc16424");
		user1.setCount(100);
		
		
		System.out.println(user1.getCount());
		System.out.println(user2.getCount());
		System.out.println(user3.getCount());
		AppUser user4 = new AppUser();
		
		System.out.println(user4.getCount());
	}

}
