package in.co.rays.exceptio.git;

public class Account {
	
	private double balance;
	
	public double getBalance () {
		return balance ;
		
	}
	public void setBalance (double balance) {
		this.balance = balance;
	}
	public void withdraw (double amount) {
		if (amount > this.balance) {
			throw new InsufficientFundException();
			
		}
	}

}
