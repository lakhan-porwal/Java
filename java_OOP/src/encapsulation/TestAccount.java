package encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		
	Account a = new Account();
	
	a.setNumber("12344960");
	a.setAccountType("saving");
	a.setBalance(1200.09);
	
	
	System.out.println("a account no :" + a.getNumber());
	System.out.println("a account type :" + a.getAccountType());
	System.out.println("a current balance : " + a.getBalance());
	
	
	a.deposit(500.03);
	a.withdrawal(300.09);
}
}
