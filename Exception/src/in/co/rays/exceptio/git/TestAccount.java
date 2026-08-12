package in.co.rays.exceptio.git;

public class TestAccount {
	
public static void main(String[] args) {
	
     Account a = new Account();
	
	a.setBalance(500.23);
	
	System.out.println("current balance = " + a.getBalance());
	
	a.withdraw(600.00);
}

}
