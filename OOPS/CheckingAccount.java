class CheckingAccount implements Account
{
	private String customerName;
	private int accountNumber;
	private double balance;

	public CheckingAccount(String customerName, int accountNumber, double initialBalance)
	{
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}
	public void deposit(double amount)
	{
		if(amount<0)
		{
			System.out.println("Cannot perform deposit operation");
		}
		else
		{
			balance = balance + amount;
		}
	}

	public boolean withdraw(double amount)
	{
		boolean status;
		if(amount<0)
		{
			status = false;
		}
		else if(balance>amount)
		{
			balance = balance - amount;
			status = true;
		}
		else
		{
			status = false;
		}
		return status;
	}

	public void displayAccount()
	{
		System.out.println("Customer Name:"+customerName);
	}

	public int getAccountNumber()
	{
		return accountNumber;
	}

	public double getBalance()
	{
		return balance; 
	}

}