package org.tnsif.acce.c2tc.oops;

class College{
	void collegeName() {
		System.out.println("Name : CITNC");
	}
}
class Classes extends College{
	void subjectName() {
		System.out.println("we have java class");
	}
}
class Teacher extends College{
	void teacherName() {
		System.out.println("java is handled by hemavathi mam");
	}
	
}

public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		Classes cls=new Classes();
		cls.collegeName();
		cls.subjectName();
		Teacher obj=new Teacher();
		obj.collegeName();
		obj.teacherName();		
		}

}
