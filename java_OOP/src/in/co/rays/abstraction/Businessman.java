package in.co.rays.abstraction;

public class Businessman extends Person implements Richman, SocialWorkers {

	@Override
	public void helpToOther() {
		System.out.println("Help To Other");
		
	}

	@Override
	public void earnmoney() {
		System.out.println("earnMoney");
		
	}

	@Override
	public void donation() {
		System.out.println("donation");
		
	}

	@Override
	public void party() {
		System.out.println("party");
		
	}
	
	

}
