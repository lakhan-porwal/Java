package in.co.rays.uml.encapsulation;

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

	public String getAccountype() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setDeposit(double amount) {
		this.balance = this.balance + amount;
	}

	public void setWithdrawal(double wamt) {
		if (wamt > balance) {
			System.out.println("insufficient fund");
		} else {
			balance = balance - wamt;
			System.out.println("total balance =>" + balance);
		}
	}

	public void setFundTransfer(double fundTransfer) {

		if (fundTransfer > balance) {

			System.out.println("Insufficient fund");

		} else {

			balance = balance - fundTransfer;

			System.out.println("Fund transferred successfully");
			System.out.println("Total balance => " + balance);
		}
	}

	public void setBillPay(double billPay) {

		if (billPay > balance) {

			System.out.println("Insufficient fund");

		} else {

			balance = balance - billPay;

			System.out.println("Bill paid successfully");
			System.out.println("Total balance => " + balance);
		}
	}
}
