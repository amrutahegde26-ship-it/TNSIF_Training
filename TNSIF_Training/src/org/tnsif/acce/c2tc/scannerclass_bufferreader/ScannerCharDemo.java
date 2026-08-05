package org.tnsif.acce.c2tc.scannerclass_bufferreader;
import java.util.Scanner;

public class ScannerCharDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		char c=scan.next().charAt(1);
		System.out.println("the second char at the string "+ c);
		scan.close();
		
	}

}
