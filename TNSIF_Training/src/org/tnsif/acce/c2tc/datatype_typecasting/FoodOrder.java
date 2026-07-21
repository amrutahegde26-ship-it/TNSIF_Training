package org.tnsif.acce.c2tc.datatype_typecasting;

public class FoodOrder {

	public static void main(String[] args) {
		//primitive datatype
		int orderId=101;
		double price=299.99;
		boolean isDelivered=false;
		char rating='A';
		float deliveryDistance=5.3f;
		long deliveryBoyPhone= 6363159890L;
		byte deliverTime=45;
		short restaurantId=12;
		
		//non primitive 
		String CustomerName="Amruta";
		String[] foodItem= {"Burger","Fries","coke"};
		
		System.out.println("order summary");
		System.out.println("customer name =" +CustomerName );
		System.out.println("order id=" + orderId);
		System.out.println("RestaurantId=" + restaurantId);
		System.out.println("delivery boy number =" + deliveryBoyPhone);
		System.out.println("food items=" );
		for (String item :foodItem) {
			System.out.println(" - " + item);
			
		}
		System.out.println("total price =" + price);
		System.out.println("Delivery distance=" + deliveryDistance);
		System.out.println("Expected time=" + deliverTime);
		System.out.println("Rating=" + rating);
		
		
		

	}

}
