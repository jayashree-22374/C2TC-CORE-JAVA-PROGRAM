package Polymorphism.overloadingexample;

public class Person {
	private int id;
	private String name;
	private String city;
	
	public Person() { //DEfault Constructor
		this.id=101;
		this.name="Jash";
		this.city="Chennai";
		
	}
	
	public Person(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public Person(int id,String name,String city) {
		this.id=id;
		this.name=name;
		this.city=city;
		
		
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
