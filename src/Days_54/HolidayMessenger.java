package Days_54;

public class HolidayMessenger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holiday h1 = new Chrismas(); 
		h1.sendHolidayMessage();
		// print h1.name 
		// print h1.giftCount 
		// 
		
		Chrismas c1 = (Chrismas) h1 ;
		System.out.println(  c1.giftCount );
		
		//System.out.println(    ( (Christmas) h1 ).giftCount       );
		
		c1.exchangeGifts();
		
		
		h1 = new NewYear() ; 
		h1.sendHolidayMessage();
		
		
		NewYear n1 = (NewYear) h1 ; 
		n1.countdown_WelcomeNewBeginning();
		
//		long i = 10 ; 
//		int j = (int)i ; 
		
		
		
		
		// ONLY REFERENCE TYPE DECIDE WHAT YOU CAN ACCESS AT COMPILE TIME
		
		GiftReceiver g=new Chrismas();
		g.receiveGift();
		Chrismas c2=(Chrismas) g;
		
	}

}
