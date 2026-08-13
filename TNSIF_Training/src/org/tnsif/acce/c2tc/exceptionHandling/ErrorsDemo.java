package org.tnsif.acce.c2tc.exceptionHandling;

public class ErrorsDemo {

	public static void main(String[] args) {
		int num1=20;
		int num2=20;
		int sum=add(num1,num2);
		System.out.println(sum);

	}
	public static int add(int num1,int num2) {
		return num1-num2; //logical error
	}
	

}
