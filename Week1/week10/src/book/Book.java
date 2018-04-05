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
	
	
	//toString
	public String toString() {
		return "Title: " + title + " by " + author + " with number " + number;
	}
	
 

}
