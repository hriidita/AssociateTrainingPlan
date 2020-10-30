package BankAccnt;

public class Transaction implements Runnable {
BankAcc accnt = new BankAcc();

	public static void main (String args[]) {
		Transaction tran = new Transaction();
		
		Thread t1 = new Thread(tran, "Pam");
		Thread t2 = new Thread(tran, "John");
		
		t1.start();
		t2.start();
	}
	
	public void run() {
		for (int i =0; i< 4; i++) {
		if(accnt.getBalance() > 0 ) {
			makeWithdrawl(2000);
		}
		else 
		{
			System.out.println("You account has been overdrawn");
		}
		
	}
	}


private synchronized void makeWithdrawl (float amountWithdrawal) {
	if (accnt.getBalance() == amountWithdrawal)
	{
	System.out.println(Thread.currentThread().getName()+ " is withdrawing money");
	try
	{
		Thread.sleep(2000);
	} catch(InterruptedException ex)
	{
		ex.printStackTrace();
	}
		accnt.withdrawalAmount(amountWithdrawal);
		System.out.println(Thread.currentThread().getName()+ " has finished withdrawing");
	} else {
		System.out.println("You have no money in the account "+ Thread.currentThread().getName());
	}
}

}

	
	
