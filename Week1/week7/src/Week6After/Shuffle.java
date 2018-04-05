package Week6After;

public class Shuffle implements IpodInterface {
    //instance variables
    private int memorySize;

    //constuctor
    public Shuffle (int memorySize) {
        this.memorySize = memorySize;
    }

    //other methods - including computePriceInDollars
    public double computePriceInDollars() {
        return (SHUFFLEMULTIPLER * memorySize)/ 1.8;
    }

    //toString
    public String toString() {
        return "Shuffle has " + memorySize;
    }
}
