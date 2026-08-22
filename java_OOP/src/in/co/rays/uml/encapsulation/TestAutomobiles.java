package in.co.rays.uml.encapsulation;

public class TestAutomobiles {

	public static void main(String[] args) {

		Automobile a = new Automobile();

		a.setColor("Red");
		a.setMake("Car");

		System.out.println(a.getColor());
		System.out.println(a.getMake());
		System.out.println("Maximum Gears => " + 5);

		System.out.println("Initial speed => " + a.getSpeed());

		while (true) {
			a.accelerator();
			System.out.println("Speed => " + a.getSpeed());

			a.changeGear();

			if (a.getSpeed() >= 200) {
				System.out.println("Speed is too high");
				System.out.println("Apply Break");

				a.break1();

				if (a.getSpeed() == 0) {
					System.out.println("Car stop");
				}
				break;
			}
		}
	}

}
