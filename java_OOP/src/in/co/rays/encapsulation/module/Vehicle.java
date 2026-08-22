package in.co.rays.encapsulation.module;

public class Vehicle {

	private int speed;
	private String brand;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public static void main(String [ ] args) {
		
		System.out.println("----Vehicle----");
		
		Vehicle v = new Vehicle();
		
		v.setBrand("xyz");
		v.setSpeed(10);
		
		System.out.println(v.getBrand());
		System.out.println(v.getSpeed());
	}

}
