package Week6After;

public class Nano implements IpodInterface {
    //instance variables
    private int memorySize;

    //constuctor
    public Nano (int memorySize) {
        this.memorySize = memorySize;
    }

    //other methods - including computePriceInDollars
    public double computePriceInDollars() {
        return (6 * memorySize) / 1.2;
    }

    public void updateMemory(int newSize) {
        memorySize = newSize;
    }

    //toString
    public String toString() {
        return "Nano has " + memorySize;
    }
}
