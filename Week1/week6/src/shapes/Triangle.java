package shapes;

/**
 * Created by carolyn.brodie on 2/10/2017.
 */
public class Triangle implements Shape {

     //instance variables
    private int base;
    private int height;

    public Triangle(int bLength, int hLength) {
        base = bLength;
        height = hLength;
    }

    public int returnHgt() {
        return height;
    }

    public double computeArea() {
        return .5 * base * height;
    }

    public String toString() {
        return "Triangle with base " + base + " and height " + height;
    }
}
