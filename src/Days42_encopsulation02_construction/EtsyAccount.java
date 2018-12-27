package Days42_encopsulation02_construction;

public class EtsyAccount {
private String firstName;
private String email;
private String password;
private String AccaountInfo;

public String getAccountInfo() {
	return firstName+ "|"+ email+"|"+ password;
	
	//return
}



public void setAccountInfo(String firstName, String email,String password) {
	this.firstName=firstName;
	this.email=email;
	setPassword(password);
}

 public String getFirstName() {
	 return firstName;
 }
 public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
 public String getEmail() {
	 return email;
 }
 public void setEmail(String email) {
		this.email=email;
 
}
 public String getPassword() {
	 return password;
	 
 }
 public void setPassword(String password) {
	 
	 if(password.length()<6) {
		 System.out.println("pasword - must at keast 6 character");
		 return;// normaly we do not use return with void but return is here jusr work as break
	 }
	 this.password=password;
 }
 
 
}