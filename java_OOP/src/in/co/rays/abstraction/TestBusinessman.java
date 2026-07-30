package in.co.rays.abstraction;


public class TestBusinessman {
	
	public static void main(String[] args) {
		
		
		Richman r = new Businessman ();
		
		r.donation();
		r.earnmoney();
		r.party();
		
		
		System.out.println("-----------");
		
		
		SocialWorkers s = new Businessman ();
		
		s.helpToOther();
		
		
		
		System.out.println("-----------");
		
		
		Businessman b = new Businessman ();
		
		b.donation();
		b.earnmoney();
		b.helpToOther();
		b.party();
		
		
		
	}

}
