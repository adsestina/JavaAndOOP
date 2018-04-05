public class Book implements Comparable<Book> {
	
	//instance variables
	private String title;
	private String author;
	private double price;
	
	
	//constructor
	public Book(String title, String author, double price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	 

	//other methods
	 
	
	public void changePrice(double newPrice)
	{
		price = newPrice;
	}
	
	public double returnPrice()
	{
		return price;
	}
	
	public boolean equals(Object obj)
	{
		if (obj instanceof Book)
		{
			Book book = (Book) obj;
			return (title.equals(book.title)) && 
					(author.equals(book.author)) &&
					(price == book.price);
		} else return false;
	}
	
	
	 public int compareTo (Book newTitle) {
		return this.title.compareTo(newTitle.title);
	 }
	
	//toString
	public String toString()
	{
		String out = title + " by " + author + " sells for " + price;
		return out;
	}
}
