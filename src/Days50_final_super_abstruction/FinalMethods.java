package Days50_final_super_abstruction;

public class FinalMethods {
public final void makeAPhoneCall(String phoneNumber) {
	System.out.println("Dial number:" +phoneNumber+"\n Press On Call");
}
public static final void readSMSMessage(String sender) {
	System.out.println("Open message and read for "+ sender );
}



}
class sub extends FinalMethods{
	
//public void makeAPhoneCall(String phoneNumber ) {//final method can not be override
//	
//}
	//}
	public final void makeAPhoneCall(int number ) {
		System.out.println("Dial number:" +number+"\n Press On Call");
/*Final method can be overload
 * 
 * 
 * 	
 */
}
}