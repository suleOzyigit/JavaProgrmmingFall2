package Days36_MethodOverLoading;

public class OverLoadingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*2 methods:add 
 * 1st:add
 *  	params:2 int
 *  	return:doule
 * 
 * 
 * 
 * 
 */
	System.out.println(add(100,400));	
	System.out.println(add(100.0,400.0,10.0));	
	System.out.println(playgame("pingpan",4));
	System.out.println(playgame(8,"pingpan"));
	}
	public static int add(int num1,int num2) {
		int add=num1+num2;
		return add;
	}
	public static double add(double d1,double d2,double d3) {
		return d1+d2+d3;
		/*Method:playGame 
		 * 1.Name:playGame
		 * 		params: int,String
		 * 		return :boolean
		 * 
		 * 2.Name:playGame
		 * 		params: String,int
		 * 		return :boolean
		 * 
		 * gameName,playOfPlayersGame
		 * 		Print Playing [game]with [that many]players
		 * if number of playing more>=2 then return true
		 * 
		 * 
		 */
		
	}
	public static boolean playgame(String game,int players) {
		System.out.println("Playing " + game+ ">with<" +">players<");
		return players>=2;
	}
	public static boolean playgame(int players,String game) {
		System.out.println("Playing " + game+ ">with<" +players+"players");
		return players>=2;
		/*Method:work 
		 * 		1.params:String.JobType
		 * 		returns boolean. if job is sdet or developers then true else false
		 * print....>working as<JobType>and 
		 * 		2.params;int.->hours
		 * 		return double->salary=hours*60
		 * print :worked<this many>hours and made <that much.income
		 * 
		 * 
		 * 
		 * 
		 */
	}
	public static boolean work(String jobType) {
		System.out.println(">working as<" +jobType+">and it is fun!");
		return jobType.equalsIgnoreCase("sdet")||jobType.equals("developers");
			
		}
	public static double work(int hours ){
		double salary=hours*60;
		System.out.println(">Worked as <"+ hours +">and made <" + salary +">income<");
		return salary;
	}
	}

