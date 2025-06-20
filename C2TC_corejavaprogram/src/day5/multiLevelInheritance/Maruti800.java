package day5.multiLevelInheritance;

public class Maruti800 extends Maruti{
	private String owner;
	private int number;
	private String city;
	public Maruti800() {
		super();
		this.owner="jash";
		this.number=2356;
		this.city="Chennai";
	}
	public Maruti800(String brand,int cost,int speed,String colour,int milage,String owner,int number,String city) {
		super(brand, cost, speed,colour,milage);
		this.owner=owner;
		this.number=number;
		this.city=city;
	}
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Maruti800 [Brand="  +getBrand()+  ", Cost=" +getCost()+ ", Speed="  +getSpeed()+ ", Colour=" +getColour()+ ", Milage=" +getMilage()+ ", Owner=" + owner + ", Number=" + number + ", City=" + city + "]";
	}
	
	

}
