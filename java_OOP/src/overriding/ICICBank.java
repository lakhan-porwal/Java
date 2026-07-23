package overriding;

public class ICICBank extends Bank {
	
	@Override 
	
	public String getName () {
		return "ICICBank";
		
	}
	@Override
	public double getinterestRate () {
		return 12.0;
		
	}

}
