package encapsulation;

public class Account {
	
	private String number;
	private String accountType;
	private double balance;
	
	public String getNumber() {
		return number;
	}
    public void setNumber(String number) {
    	this.number = number;
    	
    }
    public String getAccountType () {
    	return accountType;
    	
    }
    public void setAccountType(String accounttype) {
    	this.accountType = accounttype;
    }
    public double getBalance() {
    	return balance;
    	
    }
    public void setBalance(double balance) {
       this.balance = balance; 
       
   }
    public void deposit(double amount ) {
    	balance = balance + amount ;
    	System.out.println(" total balance after deposite  " + balance);
    	
    } 
      public void withdrawal(double wamt ) {
    	if (wamt > balance)  {
    		System.out.println("insufficent fund transfer ");
    	} else {
    		balance = balance - wamt ;
    		System.out.println("toatal balance after withdrawal :" + balance);
    	}
    		
      }
    
}
