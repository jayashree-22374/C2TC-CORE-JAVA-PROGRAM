package day1;

import java.util.Scanner;

public class ScannerProgram {
	public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a:");
	int a=sc.nextInt();
	System.out.println("Enter b:");
	int b=sc.nextInt();
	int c=a+b;
	System.out.println("The addition of c is:"+c);
	}

}
