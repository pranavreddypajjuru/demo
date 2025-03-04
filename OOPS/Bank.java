import java.util.ArrayList;
import java.util.List;

class Bank implements BankOperations {
    private List<Customer> customers = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer Added: " + customer.getCustomerId());
    }

    public void performTransaction(int accountNumber, String type, double amount) {
        Account account = null;

        for (Customer customer : customers) {
            List<Account> accounts = customer.getAccounts();
            for (Account acc : accounts) {
                if (acc.getAccountNumber() == accountNumber) {
                    account = acc;
                    break;
                }
            }
            if (account != null) break;
        }

        if (account == null) {
            System.out.println("Error: Account " + accountNumber + " not found.");
            return;
        }

        boolean success = false;

        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
            success = true;
        } else if (type.equalsIgnoreCase("withdraw")) {
            success = account.withdraw(amount);
        } else {
            System.out.println("Invalid Transaction Type: " + type);
            return;
        }

        if (success) {
            transactions.add(new Transaction(type, amount, accountNumber));
            System.out.println("Transaction Successful: " + type + " $" + amount + " on Account " + accountNumber);
        } else {
            System.out.println("Transaction Failed.");
        }
    }

    public void displayCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers available.");
            return;
        }
        for (Customer customer : customers) {
            customer.displayCustomer();
        }
    }

    public void displayTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions recorded.");
            return;
        }
        for (Transaction transaction : transactions) {
            transaction.displayDetails();
        }
    }
}
