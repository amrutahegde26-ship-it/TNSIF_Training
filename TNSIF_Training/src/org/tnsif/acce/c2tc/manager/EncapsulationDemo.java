package org.tnsif.acce.c2tc.manager;

class Human{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.setAge(21);
		obj.setName("Amruta");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println("----");
		obj.setAge(22);
		obj.setName("Amruta 1");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		

	}

}
