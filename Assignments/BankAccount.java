//12. Encapsulation
//Question: Create a class BankAccount with private variables accountNumber and balance. Provide getter and setter methods to access these variables.

class BankAccount  
{
	private int accountNumber;
	private float balance;

	 BankAccount(int aNumber, float bal)
	{
		this.accountNumber = aNumber;
		this.balance = bal;
	}

	void setAccountNumber(int aNumber)
	{
		this.accountNumber = aNumber;
	}

	int getAccountNumber()
	{
		return accountNumber;
	}
	
	void setBalance(float bal)
	{
		this.balance = bal;
	}

	float getBalance()
	{
		return balance;
	}

	public static void main(String[] args) 
	{
		BankAccount bAct = new BankAccount(457120,5362.01f);
		bAct.setAccountNumber(4571201);
		bAct.setBalance(56320.50f);

		System.out.println("Account Number is:"+bAct.getAccountNumber());
		System.out.println("Balance is:"+bAct.getBalance());
	}
}
