package book;

public class Book {
	
	//instance variables
	private String title;
	private String author;
	private int  number;
	
	//constructor
	public Book(String name, String auth, int num) {
		title = name;
		author = auth;
		number = num;
	}

	public int hashCode() {
		int h = 0;
		final int HASH_MULTIPLIER = 17;
		int h1 = title.hashCode();
		int h2 = author.hashCode();
		int h3 = new Integer(number).hashCode();
		h = (h1 * HASH_MULTIPLIER) + (h2 * HASH_MULTIPLIER) + h3;
		return h;
	}

    public boolean equals(Object obj) {
    if (obj instanceof Book) {
        Book other = (Book)obj;
        return title.equals(other.title) &&
                author.equals(other.author) &&
                number == number;
    } else
        return false;
    }
	
	
	//toString
	public String toString() {

		return "Title: " + title + " by " + author + " with number " + number;
	}
	
 

}
