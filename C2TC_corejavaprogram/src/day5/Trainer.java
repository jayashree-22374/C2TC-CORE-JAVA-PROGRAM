// This program to demonstrate Trainer sub class or derived class 
package day5;

public class Trainer extends Person{
	private String designation;
	private String location;
	public Trainer() // default constructor
	{
		super(); // calling base class constructor
		this.designation="Program Trainer";
		this.location="Chennai";
	}
	
	public Trainer(int id,String name,String city,String designation,String location) 
	{
		super(id,name,city); //calling base class parameterized constructor
		this.designation=designation;
		this.location=location;
		
	}
	public String getdesignation() {
		return designation;
	}
	public void setdesignation(String designation) {
		this.designation = designation;
	}
	public String getlocation() {
		return location;
	}
	public void setlocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Trainer [ id:"+getId()+ "Name: "+getName()+" City:"+getCity()+"designation=" + designation + ", location=" + location + "]";
	}
	

}
