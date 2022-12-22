package sampp;

public class Account {
		 int accountNo;
		 String accountType;
		 int accountBalance;
			
		 public void setAccountDetails(int accountNo, String accountType, int accountBalance) {
		  this.accountNo = accountNo;
		  this.accountType = accountType;
		  this.accountBalance = accountBalance;
		 }
			
		 public void withdraw(int amount) {
		  accountBalance = accountBalance - amount;
		  System.out.println("Withdrawal of Rs. " + amount + " is successful.");
		 }
			
		 public void deposit(int amount) {
		  accountBalance = accountBalance + amount;
		  System.out.println("Deposit of Rs. " + amount + " is successful.");
		 }
			
		 public void dispAccountDetails() {
		  System.out.println("Account number: " + accountNo);
		  System.out.println("Account type: " + accountType);
		  System.out.println("Account balance: Rs. " + accountBalance);
		 }
		}

		