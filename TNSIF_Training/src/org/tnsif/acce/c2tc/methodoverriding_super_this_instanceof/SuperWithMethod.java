package org.tnsif.acce.c2tc.methodoverriding_super_this_instanceof;

class Payment1{
	void process() {
		System.out.println("processing payment using stndard gateway");
	}
}
class Gpay extends Payment1{
	void process() {
		System.out.println("processing payment via gpay");
	}
	void CompleteTransaction() {
		super.process();
		process();
	}
}

public class SuperWithMethod {

	public static void main(String[] args) {
		Gpay obj=new Gpay();
		obj.CompleteTransaction();
		}

}
