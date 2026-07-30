package in.co.rays.abstraction;

public class TestBusinessman2 {
	
	public static void main(String[] args) {
		
		
		Richmann r = new Businessman2 ();
		r.earnmoney();
		r.donation();
		r.party();
		
		System.out.println("------------");
		
		SocialWorkerss s = new Businessman2 ();
		s.helpToOthers();
		
		
		System.out.println("------------");
		
		Businessman bm = new Businessman ();
		bm.donation();
		bm.earnmoney();
		bm.party();
		bm.helpToOther();
		
		
		
	}

}
