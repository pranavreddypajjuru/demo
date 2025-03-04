interface Account
{
	void deposit(double amount);
	boolean withdraw(double amount);
	void displayAccount();
	int getAccountNumber();
	double getBalance();
}