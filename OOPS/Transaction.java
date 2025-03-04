class Transaction
{
	private String type;
	private double amount;
	private int accountNumber;

	public Transaction(String type, double amount, int accountNumber)
	{
		this.type = type;
		this.amount = amount;
		this.accountNumber = accountNumber;
	}

	public void displayDetails()
	{
		System.out.println("Type:"+type+"\n Amount:"+amount+"\n AccountNumber:"+accountNumber+"\n");
	}
}