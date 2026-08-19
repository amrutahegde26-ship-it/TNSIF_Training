package org.tnsif.acce.c2tc.collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

class person6 implements Comparable<person6>{
	String name;
	int age;
	person6(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("name :"+ name + "age :"+ age);
	}
	
	
	public int compareTo(person6 other) {
		return this.name.compareTo(other.name);
	}
}

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<person6> people=new ArrayList<>();
		people.add(new person6("amruta", 21));
		people.add(new person6("amruta2", 21));
		people.add(new person6("amruta3", 21));
		Collections.sort(people);
		for(person6 person:people) {
			person.display();
		}
		
		

	}



}