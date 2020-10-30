package BankAccnt;

public class BankAcc {
		
		float balance = 10000;
		
		public float getBalance( ) {
			return balance;
		}
		
		public void withdrawalAmount(float amount)
		{
			balance = balance - amount;
			System.out.println("Account balance after withdrawal is  :" + balance);
		}

	}

