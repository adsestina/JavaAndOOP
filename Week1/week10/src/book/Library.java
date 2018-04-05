package book;
import java.util.ArrayList;
import java.util.ListIterator;

public class Library {
	
	//instance variables
	private String branchName;
	private ArrayList<Book> bookList;
	
	//constructor
	public Library(String name) {
		branchName = name;
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(Book toAdd) {
		bookList.add(toAdd);
	}
	
	public String toString() {
		String out = "Library branch " + branchName + " contains the following: ";
		ListIterator iter = bookList.listIterator();
		while (iter.hasNext()) {
			out = out + iter.next() + " ";

		}
		return out ;
	}

}
