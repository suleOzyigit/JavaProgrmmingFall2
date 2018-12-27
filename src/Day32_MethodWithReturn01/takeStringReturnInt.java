package Day32_MethodWithReturn01;

public class takeStringReturnInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//isValidDay method : accepts a weekDayName and check
		//if it is a valid one of 7 days return true otherwise return false
		Boolean valid=isValidDay("sule");
		System.out.println(valid);
	}
public static  boolean isValidDay(String day) {
	day=day.toLowerCase().trim();
	if(day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("thursday")|| day.equals("firiyday")||day.equals("Saturday")||day.equals("sanday")) {
		return true;//you can use else if too
	}else {
		return false;
	}
	//return false;
	}
}

