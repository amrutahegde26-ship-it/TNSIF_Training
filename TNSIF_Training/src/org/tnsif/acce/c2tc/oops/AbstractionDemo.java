package org.tnsif.acce.c2tc.oops;

public class AbstractionDemo {

	public static void main(String[] args) {
		Amruta obj = new Ashrita();
		obj.calling();
		obj.aiIntegration();
		obj.satelliteComm();
		obj.healthMonitoring();
		
		
			}
}
abstract class Amruta{
	void calling() {
		System.out.println("mbl is having calling functionality");
	}
	abstract void aiIntegration();
	abstract void satelliteComm();
	abstract void healthMonitoring();
}
abstract class Arpitha extends Amruta{
	void aiIntegration() {
		System.out.println("phone is integrated with Ai integrationt");
	}
	abstract void satelliteComm();
	abstract void healthMonitoring();
	
}
 class Ashrita extends Arpitha{
	void satelliteComm() {
		System.out.println("phone has satellite feature");
	}
	void healthMonitoring() {
		System.out.println("phone has healt monitoring feature");
	}
}


