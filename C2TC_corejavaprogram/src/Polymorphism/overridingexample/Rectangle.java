package Polymorphism.overridingexample;

public class Rectangle extends Shape {
	private double l,b;
	public Rectangle (double l,double b) { // parameterized constructor
		this.l=l;
		this.b=b;
		
	}
	@Override
	public void calArea() {
		System.out.println("From Rectangle class:"+(l*b));
	}

}
