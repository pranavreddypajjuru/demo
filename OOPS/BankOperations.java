interface BankOperations
{
	void addCustomer(Customer customer);
	void performTransaction(int accountNumber, String type, double amount);
	void displayCustomers();
	void displayTransactions();
}