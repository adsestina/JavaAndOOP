package jan31After;

public class Circle {

    //instance variables
    private int radius;

    //constructor
    public Circle(int radius) {

        this.radius = radius;
    }

    //other methods
    public double calculateArea() {
        double circleArea = (Math.PI * Math.pow(radius,2));
        return circleArea;
    }

    //toString
    public String toString() {
//        return radius + "";
//        return Integer.toString(radius);
        return "Circle with radius " + radius;
    }
}
