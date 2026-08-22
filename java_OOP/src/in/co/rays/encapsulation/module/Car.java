package in.co.rays.encapsulation.module;

public class Car extends Vehicle {

	private int gear;

	public int getGear() { 
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}
	public void Start() {
	   System.out.println("Car start");
	}
	public void ChangeGear() {
		System.out.println("Change Gear");
	}
}
