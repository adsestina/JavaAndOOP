package IpodExercise;

public class Product {

    private Price type;

    public Product(Price type) {
        this.type = type;
    }

    public double computePrice() {
        return type.computePrice();

    }

    public String toString() {
        return "This iPod " + type + " GB memory and costs $" + computePrice();
    }

}
    