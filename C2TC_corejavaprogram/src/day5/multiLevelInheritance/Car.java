package day5.multiLevelInheritance;

public class Car {
	private String brand;
	private int cost;
	private int speed;
	public Car() {
		this.brand="Maruti";
		this.cost=1200000;
		this.speed=120;
	}
	public Car(String brand,int cost,int speed) {
		this.brand=brand;
		this.cost=cost;
		this.speed=speed;
	}
	
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", cost=" + cost + ", speed=" + speed + "]";
	}
	
	

}
