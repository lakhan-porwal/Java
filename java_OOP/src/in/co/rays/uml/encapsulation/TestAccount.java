package in.co.rays.uml.encapsulation;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setNumber("320008404");
		a.setAccountType("saving account");
		a.setBalance(500.00);
		
		System.out.println(a.getNumber());
		System.out.println(a.getAccountype());
		System.out.println(a.getBalance());
		
		a.setDeposit(5000.00);
		System.out.println(a.getBalance());
		
		a.setWithdrawal(20000);
		
	    a.setWithdrawal(3000.00); 
		System.out.println(a.getBalance());
		
		a.setFundTransfer(200);
		System.out.println(a.getBalance());
		
		a.setFundTransfer(2500);
		
		a.setBillPay(1200);
	}

}
