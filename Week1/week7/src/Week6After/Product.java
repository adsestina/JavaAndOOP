package Week6After;

public class Product {

    private IpodInterface type;


    public Product(IpodInterface type) {
        this.type = type;

    }

    public double computePrice() {
         return type.computePriceInDollars();
    }

    public String toString() {
        return type + " GB memory" + " and costs $" + computePrice();
    }

}
    