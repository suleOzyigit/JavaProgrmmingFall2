package Days47_accessModifier01;
//vaCompusStudents is a Students
public class VaCampus {
	
	
VaCompusStudents campusStudents=new VaCompusStudents();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.name="serik";//public
		//student.ssn ssn is private only visibable
		student.age=27;
		student.campus="McLean";
	}

}
