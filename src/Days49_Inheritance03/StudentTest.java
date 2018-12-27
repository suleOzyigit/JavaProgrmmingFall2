package Days49_Inheritance03;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student=new  Student();
OnlineStudent onlineStudent=new OnlineStudent();
OnCampusStudent onCampusStudent= new OnCampusStudent();
student.attendAClass();
onlineStudent.attendAClass();
onCampusStudent.attendAClass();

	}

}
