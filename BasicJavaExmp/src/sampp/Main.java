package sampp;

public class Main {
	
		 public static void main(String[] args) {
		  Account ac1 = new Account();
		  System.out.println("Account Details: ");
		  ac1.setAccountDetails(12345, "Savings Account", 10000);
		  ac1.dispAccountDetails();
		  System.out.println("Transaction Details: ");
		  ac1.withdraw(2000);
		  ac1.deposit(1000);
		  System.out.println("Updated Account Details: ");
		  ac1.dispAccountDetails();
		 }
		}

