package Week6After;

public class Touch implements IpodInterface {

    //instance variables
    private int memorySize;

    //constuctor
    public Touch(int memorySize) {
        this.memorySize = memorySize;
    }

    //other methods - including computePriceInDollars
    public double computePriceInDollars() {
        return 8 * memorySize;
    }

    //toString
    public String toString() {
        return "Touch has " + memorySize;
    }
}
