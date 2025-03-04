class Book implements LibraryItem
{
	private String title;
	private String author;
	private int id;
	private String genre;

	public Book(String title, String author, int id, String genre)
	{
		this.title = title;
		this.author = author;
		this.id = id;
		this.genre = genre;
	}

	public void displayDetails()
	{
		System.out.println("Title:"+this.title);
		System.out.println("Author:"+this.author);
		System.out.println("Id"+this.id);
		System.out.println("Genre:"+this.genre);
	}

	public int getId()
	{
		return id;
	}


}