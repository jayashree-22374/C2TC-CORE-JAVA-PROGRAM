package day5.multiLevelInheritance;

public class Maruti extends Car{
	private String colour;
	private int milage;
	public Maruti() {
		
		super();
		this.colour="Red";
		this.milage=24;
	}
	public Maruti(String brand,int cost,int speed,String colour,int milage) {
		super(brand,cost,speed);
		this.colour=colour;
		this.milage=milage;
	}
	
	
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	@Override
	public String toString() {
		return "Maruti [brand"+getBrand()+"Cost"+getCost()+"Speed"+getSpeed()+"colour=" + colour + ", milage=" + milage + "]";
	}
	

}
