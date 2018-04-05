package Week6After;

public class Classic implements IpodInterface{
    //instance variables
    private int memorySize;

    //constuctor
    public Classic (int memorySize) {
        this.memorySize = memorySize;
    }

    //other methods - including computePriceInDollars
    public double computePriceInDollars() {
        return 10 * memorySize + 50;
    }

    //toString
    public String toString() {
        return "Classic has " + memorySize;
    }
}
