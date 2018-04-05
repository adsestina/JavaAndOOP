package bookExcercise;

import java.time.format.TextStyle;

public class BookTester {
    public static void main(String[] args) {
        Book book1 = new Book("Gone with the Wind", "Mitchell", 11.20);
        Book book2 = new Book("Gone with the Wind", "Mitchell", 11.20);
        TextBook text1 = new TextBook("Gone with the Wind", "Mitchell", 11.20, "lit");
        System.out.println(book2.returnPrice());
        System.out.println(book1);
        System.out.println(book2);
        TextBook text2 = new TextBook("Big Java", "Cay Horstmann", 100.00, "computer science");
        System.out.println(text1);
    }

}