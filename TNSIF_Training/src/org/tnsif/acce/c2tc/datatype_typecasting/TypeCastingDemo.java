package org.tnsif.acce.c2tc.datatype_typecasting;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//shopping cart
		//widening (implicit casting small-large)
		
		double pricePerItem=99.50;
		int quantity=3;
		double totalPrice=quantity*pricePerItem;
		
		//narrowing(explicit casting large-small)
		double discount=10.75;
		int roundedDiscount=(int)discount;
		
		double finalAmount=totalPrice-roundedDiscount;
		
		System.out.println("online shopping summary");
		System.out.println("itmens bought =" + quantity);
		System.out.println("price per item = "+ pricePerItem);
		System.out.println("final amount to pay after discount ="+ finalAmount);

	}

}
