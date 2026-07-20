package constructor;

public class TestAccount {
	
	
	public static void main(String[] args) {
		 
		Account a = new Account ();
		
		
		Account a1 = new Account ("100000" , "saving " , 50000.00);
		
		System.out.println(a1.getNumber ());
		System.out.println(a1.getAccountType());
		System.out.println(a1.getBalance());
		
	}

}
