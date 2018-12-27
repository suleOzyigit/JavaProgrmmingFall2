package Days47_accessModifier02;

import Days47_accessModifier01.Student;

public class OtherPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student=new Student();//we imported
student.name="mike";
//student ssn=3333; private
// student.age=44 different package
//student.campus= not visible 
	}

}
