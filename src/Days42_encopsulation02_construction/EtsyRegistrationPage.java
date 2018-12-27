package Days42_encopsulation02_construction;

public class EtsyRegistrationPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EtsyAccount account1=new EtsyAccount();
account1.setEmail("account1@gmail.com");
account1.setPassword("adam123");
account1.setFirstName("Adem");
EtsyAccount account2=new EtsyAccount();
account2.setEmail("account2@gmail.com");
account2.setPassword("jashua345");
account2.setFirstName("Jashua");

EtsyAccount account3=new EtsyAccount();
account3.setEmail("account2@gmail.com");
account3.setPassword("123");
account3.setFirstName("_");
System.out.println("First name of account 1 " + account1.getFirstName());


EtsyAccount myAccount=new EtsyAccount();
myAccount.setAccountInfo("myemail@yahoo.com","Bill", "abc123");
System.out.println(myAccount.getEmail() +" | " + myAccount.getFirstName() +" | " + myAccount.getPassword());

//myAccount.setEmail("myemail@gmail.com");

System.out.println("=========dene======");
//myAccount.setEmail( myAccount.getEmail().replace("yahoo", "gmail") );
myAccount.setEmail( myAccount.getEmail().replace("yahoo", "gmail") );

System.out.println(myAccount.getEmail() +" | " + myAccount.getFirstName() +" | " + myAccount.getPassword());


//create e method getAccountInfo() that returns email,first name pasword values

System.out.println( myAccount.getAccountInfo() );

EtsyAccount yourAccount = new EtsyAccount();
yourAccount.setAccountInfo("yourEmail23@gmail.com", "Apple", "moacbook34");
String accountInfo = yourAccount.getAccountInfo();

System.out.println(accountInfo);



	}

}
