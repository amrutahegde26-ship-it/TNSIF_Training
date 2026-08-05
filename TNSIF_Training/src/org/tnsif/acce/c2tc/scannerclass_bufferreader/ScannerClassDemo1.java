package org.tnsif.acce.c2tc.scannerclass_bufferreader;
import java.util.Scanner;

public class ScannerClassDemo1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter you name");
		String name=scan.nextLine();
		System.out.println("enter you age");
		int age=scan.nextInt();
		System.out.println("Name of the user " +name);
		System.out.println("age of the user "+age);
		scan.close();
		

	}

}
