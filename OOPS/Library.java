import java.util.ArrayList;
class Library implements LibraryOperations
{
	ArrayList<LibraryItem> lItem = new ArrayList<>();

	public void addItem(LibraryItem item)
	{
		lItem.add(item);
	}

	public void addItem(Book book)
	{
		lItem.add(book);
	}
	
	public void addItem(Magazine magazine)
	{
		lItem.add(magazine);
	}
	
	public void displayItems()
	{
		for(LibraryItem item : lItem)
		{
			item.displayDetails();
			System.out.println();
		}
	}
}