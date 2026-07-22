package org.tnsif.acce.c2tc.oops;

public class FoodItem {
	//variable
	
	String name;
	double price;
	String category;
	
	//method
	void displayDetails() {
		System.out.println("Food name= " +name);
		System.out.println("price ="+ price);
		System.out.println("category =" + category);
		System.out.println("---");
	}

	public static void main(String[] args) {
		FoodItem fooditem1=new FoodItem();
		fooditem1.name="burger";
		fooditem1.price=299.99;
		fooditem1.category="fast food";
		
		fooditem1.displayDetails();
		
		FoodItem fooditem2=new FoodItem();
		fooditem2.name="pizza";
		fooditem2.price=199.99;
		fooditem2.category="my fav";
		
		fooditem2.displayDetails();
			
		

	}

}
