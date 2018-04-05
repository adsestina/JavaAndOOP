public class Circle {

   // instance variables
    private int radius;

    // constructor

    public Circle(int radius) {
        this.radius = radius;

    }
    // other method

    public double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }
    // toString

        public String toString() {
        return radius + "";
    }
}


