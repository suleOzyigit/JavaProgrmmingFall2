package Days_54;

public class HolidayUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//call below message by passing whole the argument you can pass
		
		Holiday h1=new 	Holiday();
		sendMessage(h1);
		Holiday h2=new 	Chrismas();
		sendMessage(h2);
		Holiday h3=new 	NewYear();
		sendMessage(h3);
	}
static void sendMessage(Holiday h) {
	System.out.println("Send message from utility");
	h.sendHolidayMessage();
}
}
