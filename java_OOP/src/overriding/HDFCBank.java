package overriding;

public class HDFCBank extends Bank{
	
	@Override 
	
	public String getName () {
		return "HDFCBank";
	}
	
	@Override
	public double getinterestRate () {
		return 11.50;
		
	}

}
