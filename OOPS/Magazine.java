class Magazine implements LibraryItem
{
	private String mTitle;
	private String mAuthor;
	private int mId;
	private String mGenre;

	public Magazine(String mTitle, String mAuthor, int mId, String mGenre)
	{
		this.mTitle = mTitle;
		this.mAuthor = mAuthor;
		this.mId = mId;
		this.mGenre = mGenre;
	}

	public void displayDetails()
	{
		System.out.println("Title:"+this.mTitle);
		System.out.println("Author:"+this.mAuthor);
		System.out.println("Id"+this.mId);
		System.out.println("Genre:"+this.mGenre);
	}

	public int getId()
	{
		return mId;
	}


}