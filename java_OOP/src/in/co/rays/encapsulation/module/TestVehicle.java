package in.co.rays.encapsulation.module;

public class TestVehicle {

	public static void main(String[] args) {

		System.out.println("----Car----");
		
		Car c = new Car();
		
		c.setBrand("BMW");
		c.setGear(3);
		c.setSpeed(100);
		
		c.Start();
		System.out.println(c.getBrand());
		System.out.println(c.getGear());
		System.out.println(c.getSpeed());
		c.ChangeGear();
		
		System.out.println("");
		
		System.out.println("----Bike----");
		
		Bike b = new Bike();
		
		b.setBrand("Ninja zx 10r");
		b.setGear(4);
		b.setSpeed(200);
		
		b.Start();
		System.out.println(b.getBrand());
		System.out.println(b.getGear());
		System.out.println(b.getSpeed());
		b.ChangeGear();
	}

}
