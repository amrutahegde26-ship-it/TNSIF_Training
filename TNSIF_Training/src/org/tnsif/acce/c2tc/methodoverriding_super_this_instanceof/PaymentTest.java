package org.tnsif.acce.c2tc.methodoverriding_super_this_instanceof;
class Payment{
	void makePayment() {
		System.out.println("processing payment uing generic method");
	}
	
}
class UpiPayment extends Payment{
	void makePayment() {
		System.out.println("payment received by upi");
	}
}
class CardPayment extends Payment{
	void makePaymen() {
		System.out.println("payment is done using card");
	}
}
class WalletPayment extends Payment{
	void makePayment() {
		System.out.println("payment done via wallet");
	}
}

public class PaymentTest {

	public static void main(String[] args) {
		Payment payment; //reference parent class
		payment =new UpiPayment();
		payment.makePayment();
		payment=new CardPayment();
		payment.makePayment();
		
		
		payment=new WalletPayment();
		payment.makePayment();
		

	}

}
