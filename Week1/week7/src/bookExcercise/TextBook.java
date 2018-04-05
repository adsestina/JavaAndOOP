package bookExcercise;

import java.util.ArrayList;

public class TextBook extends Book {
    private String subject;
    private ArrayList<String> resources;

    public TextBook(String title, String author, double price, String subject) {
        super(title, author, price);
        this.subject = subject;
        resources = new ArrayList<>();
    }
    public void changePrice(double amount){
        super.changePrice(amount + (.1 * amount));
    }
    public void addResource(String resource) {
        if (!resources.contains(resource))
        resources.add(resource);
    }

    public String toString() {
        String out = super.toString() + " subject is " + subject;
        if (resources.size() > 0) {
            out = resources + out;
            return out;
        }
        return out;
    }
}