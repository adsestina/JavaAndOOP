package bookExcercise;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }

    public boolean equals(Object obj) {
        if(obj instanceof Book){
        Book bk = (Book) obj;
        return (title.equals(bk.title) &&
                author.equals(bk.author) &&
                price == price);
    }else
            return false;

    }
    public double returnPrice(){
        return price;
    }
    public void changePrice(double newPrice){
        price = newPrice;
    }

    public String toString() {
        return "bookExcercise.BookTester.Book title is "+title+" author is "+author+" price is $"+price;
    }
}

