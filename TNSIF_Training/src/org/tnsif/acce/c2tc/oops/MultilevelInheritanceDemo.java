package org.tnsif.acce.c2tc.oops;

class Device{
	void deviceType() {
		System.out.println("i am an electronic device");
	}
}
class Phone extends Device{
	void phoneType() {
		System.out.println("my phone is android phone");
	}
}
class Laptop extends Phone{
	void laptopType() {
		System.out.println("it is lenovo laptop");
	}
}
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		Laptop laptop=new Laptop();
		laptop.deviceType();
		laptop.phoneType();
		laptop.laptopType();
	}
}
