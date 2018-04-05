package shapes;

public class Circle implements Shape {

    //instance variables
    private int radius;

    //constructor
    public Circle(int rad) {
        radius = rad;
    }

    //other methods
    public double computeArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public String toString() {
        return "Circle with radius " + radius;
    }


}
    