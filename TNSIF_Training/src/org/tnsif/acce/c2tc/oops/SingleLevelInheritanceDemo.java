package org.tnsif.acce.c2tc.oops;

//parent class
class Course{
	String courseName="java programming";  //instance variable
	void showCourse() {
		System.out.println("course:"+courseName);
	}
}
class Student extends Course{
	String name="Amruta";
	void showStudent() {
		System.out.println("Student: "+name);
	}
}

public class SingleLevelInheritanceDemo {

	public static void main(String[] args) {
		Student student=new Student();
		student.showCourse();
		student.showStudent();
		

	}

}
