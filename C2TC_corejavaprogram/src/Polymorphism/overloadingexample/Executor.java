package Polymorphism.overloadingexample;

public class Executor {
	public static void main(String[]args) {
		System.out.println("1.Addition:"+OverloadingExample.addition(0.03f, 100));
		System.out.println("2.Addition:"+OverloadingExample.addition("0.007","0.05"));
		System.out.println("3.Addition:"+OverloadingExample.addition("Cat", "Dog"));
		System.out.println("4.Addition:"+OverloadingExample.addition(10, 0.0f));
		System.out.println("5.Addition:"+OverloadingExample.addition(40, 50));
	
	
	Person p1=new Person();
	System.out.println(p1);
	
	Person p2=new Person(102,"Jayashree");
	System.out.println(p2);
	
	Person p3=new Person(103,"Jayashree","Chennai");
	System.out.println(p3);
	
	}
	
			

}
