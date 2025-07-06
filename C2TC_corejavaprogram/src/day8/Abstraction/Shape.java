package day8.Abstraction;

public abstract class Shape {   //Abstract class
	
	protected float area;
    
    //abstract method 
	 abstract void calArea();
	 
	 //concrete method
	 void show()
	 {
		 System.out.println("Area of shape is "+area);
	 }

}
