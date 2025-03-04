class Main 
{
	public static void main(String[] args) 
	{
		LibraryItem lb = new Book("Beautiful Disaster", "Jamie McGuire", 1, "Romance");
		LibraryItem lb1 = new Book("Hopeless", "Collen", 2, "Romance");
		LibraryItem lb2 = new Book("Dune", "Frank", 3, "Fantasy");
		
		LibraryItem m = new Magazine("Time", "A", 4, "News");
		LibraryItem m1 = new Magazine("Nation", "B", 5, "Country Info");
		
		Library l = new Library();
		l.addItem(lb);
		l.addItem(lb1);
		l.addItem(lb2);

		l.addItem(m);
		l.addItem(m1);

		l.displayItems();
	}
}
