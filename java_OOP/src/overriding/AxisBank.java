package overriding;

public class AxisBank extends Bank {
	
	
	@Override 
	
	public String getName () {
		return "AxisBank";
		
	}
	
	@Override
	
	public double getinterestRate () {
		return 11.25;
		
	}
	

}
