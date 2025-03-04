import java.util.*;
class Customer
{
	private String name;
	private int customerId;
	private List<Account> l = new ArrayList<>();

	public Customer(String name, int customerId)
	{
		this.name = name;
		this.customerId = customerId;
	}

	public void addAccount(Account account)
	{
		l.add(account);
	}

	public List<Account> getAccounts()
	{
		return l;
	}

	public int getCustomerId()
	{
		return customerId;
	}

	public void displayCustomer()
	{
		System.out.println("Name:"+name+"\n Customer Id:"+customerId+"\n");
	}
}