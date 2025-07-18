// This program demonstrate person base class
package day5;

public class Person {
	private int id;
	private String name;
	private String city;
	public Person() // Default Constructor
	{
		this.id=101;
		this.name="Unknown";
		this.city="Chennai";
	}
	
	public Person(int id,String name, String city) // parameterized constructor
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
