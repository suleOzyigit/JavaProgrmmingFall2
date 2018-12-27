package Days40_CostumClass;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.work();// it is not going to  work we should assing variable first
		
		emp1.firstName="Mike";
		emp1.LastName="Smith";
		emp1.jobTitle="Scrum Master";
		emp1.emaildaress=emp1.firstName +emp1.LastName + "@mail.com";
		emp1.hourlysalary=65.50;
		Employee emp2=new Employee();
		emp2.firstName="Joe";
		emp2.LastName="Doe";
		emp2.jobTitle="SDET";
		emp2.emaildaress=emp2.firstName +emp2.LastName + "@mail.com";
		emp2.hourlysalary=54.50;
		System.out.println("Email: " +emp1.emaildaress.toLowerCase());
		System.out.println("Email: " +emp2.emaildaress);
		
		emp1.work();
		emp2.work();
		
	}

}
