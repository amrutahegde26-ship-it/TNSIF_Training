package org.tnsif.acce.c2tc.MarkerInterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Registerable s=(Registerable) new Student(12,"Sushma",20000,"Java Programming");
		Registerable s1=(Registerable) new Student(13,"Anil",30000,"Java Programming");
		
		Object obj=new Object();
		
		if(s1 instanceof Registerable)
		{
			System.out.println("Student is registered for this course");
			
		}
		else
		{
			System.out.println("Student is not registered for this course");
		}
		

	}

}