package encapsulation;

public class TestAutoMobile {
	public static void main(String[] args) {
		
		AutoMobile a = new AutoMobile();
		a.setColor("Green");
		a.setSpeed(140);
		a.setMake("Bike ");
		a.brake(0);
		a.accelerate("fast");
		a.changeGear(3);
		
		
		
		
		System.out.println("color : " + a.getcolor());
		System.out.println("speed : " + a.getSpeed());
		System.out.println("make : " + a.getMake());
		System.out.println(" brake :" + a.brake());
		System.out.println("accelerate :" + a.accelerate());
		System.out.println("changeGear : " + a.changeGear());
		
	}

}
