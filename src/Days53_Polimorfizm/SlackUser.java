package Days53_Polimorfizm;
/*WARM UP 

Create 3 classes 

SlackUser.  ---> Abstract

	Instance Field
	  	age , name , 
	Constructor 
		2 arg constructor to set the field value 
	Methods 
		abstract sendMessage , take one string and return nothing


RegularUser
	
	Field
		groupNumber : int 
	Constructor 
		3 args constructor to set the field values 

	Methods : joinAGroup()
		implement override sendMessage 


AdminUser 

	Field 
		isOwner : boolean
	Constructor 
		3 args constructor to set the field values 
	Methods : 
		activateUser take one String name as param return nothing 
	 	deActivateUser take one String name as param return nothing 

	 	override sendMessage to print ,send with @channel
 * 
 * 
 * 
 * 
 * 
 * 
 */

public abstract  class SlackUser {
	int age;
	String name;
	
	
	
	
	public SlackUser(int age,String name ) {
		this.age=age;
		this.name=name;
	}
	public abstract void sendMessage( String Message);

}
















