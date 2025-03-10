public class Main1 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Customer customer1 = new Customer("Pranav", 101);
        Customer customer2 = new Customer("Reddy", 102);
        
        Account savings = new SavingsAccount("Pranav", 1001, 5000);
        Account checking = new CheckingAccount("Reddy", 1002, 3000);

        customer1.addAccount(savings);
        customer2.addAccount(checking);

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        
        bank.performTransaction(1001, "deposit", 2000);
        bank.performTransaction(1001, "withdraw", 6000); 
        bank.performTransaction(1002, "withdraw", 1500);
       
        System.out.println("Customer Details:");
        bank.displayCustomers();

        System.out.println("Transaction History:");
        bank.displayTransactions();
    }
}
