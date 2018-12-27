package Days_54;

public class Chrismas extends Holiday implements GiftReceiver {
int giftCount; 

@Override
public void sendHolidayMessage() {
    System.out.println("Merry Christmas!");
}

public static void exchangeGifts() {
    System.out.println("Exchanging gifts");
}

@Override
public void receiveGift() {
	// TODO Auto-generated method stub
	System.out.println("receive gift in Christmas");
}


}

