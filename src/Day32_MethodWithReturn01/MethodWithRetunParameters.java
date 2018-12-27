package Day32_MethodWithReturn01;

public class MethodWithRetunParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String newEmail=buildEmail("sule","Uslu");
		System.out.println(newEmail);
		int larger=getMat(100,36);
		System.out.println(larger);
		int bigger=getMax3(-3,100, 0);
		System.out.println(bigger);
	}
//build email that will eccept firs name and lastname and 
	//retun mith a full email
	public static String buildEmail(String Firstname,String lastName) {
		String names="sule";
  	    String last="Uslu";
		String email=names.toLowerCase()+"_"+last.toLowerCase()+"@gmail.com";
		return email;
		
		
	}
	//create method getMax that accepst two ints reurn larger one
	
	public static int getMat(int num1,int num2) {
		int max;
		if(num1>num2) {
			 max=num1;
			
		}else {
			max=num2;
		}
		return max;
	}	
	//methaod get Max3 that accept 3 int and return largest one
	public static int getMax3(int n1,int n2, int n3) {
		int big;
		if(n1>n2&&n1>n3) {
			big= n1;
		}else if(n2>n1&&n2>n3) {
			big= n2;
		}else {
			big= n3;
		}
		return big;
	}
	}


