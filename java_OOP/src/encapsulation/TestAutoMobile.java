package encapsulation;

public class TestAutoMobile {
	public static void main(String[] args) {
		
		AutoMobile a = new AutoMobile();
		a.setColor("Green");
		a.setSpeed(400);
		a.setMake("Bike ");
		
		
		
		
		
		System.out.println("color : " + a.getcolor());
		System.out.println("speed : " + a.getSpeed());
		System.out.println("make : " + a.getMake());
	//a.brake();
//	a.accelerate();
	
a.changeGear(7);
	
		
	}

}
