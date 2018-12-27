package Days53_Polimorfizm;

public class RegularUser extends SlackUser {
int groupNumber;



public RegularUser(String name,int age,int groupNumber ) {
	super( age,name );
	this.groupNumber=groupNumber;
	
}

//public abstract void sendMessage( String Message);
@Override
public void sendMessage( String massage) {
	// TODO Auto-generated method stub
	
}
public void joinAGroup(int groupNumber) {
	
}

}
