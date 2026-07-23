package overriding;

public class TestBank {
	
	public static void main(String[] args) {
		Bank b1 = new AxisBank ();
		
		System.out.println(b1.getName());
		System.out.println(b1.getinterestRate());
		
		System.out.println(".......");
		
		
		
		Bank b2 = new HDFCBank ();
		
		
		System.out.println(b2.getName());
		System.out.println(b2.getinterestRate());
		
		System.out.println(".......");
		
		
		
		Bank b3 = new ICICBank();
		
		System.out.println(b3.getName());
		System.out.println(b3.getinterestRate());
	}
	

}
