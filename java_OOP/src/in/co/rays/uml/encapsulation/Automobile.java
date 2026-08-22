package in.co.rays.uml.encapsulation;

public class Automobile {

	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS = 5;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void break1() {
		speed = 0;
	}

	public void changeGear() {
		if (speed == 0) {
			System.out.println("Car is Neutral");
		} else if (speed <= 20) {
			System.out.println("Gear = 1");
		} else if (speed <= 40) {
			System.out.println("Gear = 2");
		} else if (speed <= 60) {
			System.out.println("Gear = 3");
		} else if (speed <= 80) {
			System.out.println("Gear = 4");
		} else {
			System.out.println("Gear = 5");
		}
	}

	public void accelerator() {
		speed = speed + 10;
	}

}
