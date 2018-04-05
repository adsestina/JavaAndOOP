package book;

public class BookTester {
	
	public static void main (String[] args) {
		Book bk1 = new Book("The Story", "Joe Doe", 123);
		Book bk2 = new Book ("Sports 101", "Sam Spade", 345);
		Book bk3 = new Book ("Nancy Drew", "Rose Bush", 323);
		Book bk4 = new Book ("The Hardy Boys", "Tom Thumb", 677);
		Library east = new Library("The East Branch");
		east.addBook(bk1);
		east.addBook(bk2);
		east.addBook(bk3);
		east.addBook(bk4);
		
		System.out.println(east);
		 
		
 
	}

}
