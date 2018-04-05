package jan31After;

public class Cylinder {

    //instance variables
    private Circle base;
    private int height;

    //constructor
    public Cylinder(Circle circle, int height) {
        base = circle;
        this.height = height;
    }

    public double calculateVolume() {
        double vol = height * base.calculateArea();
        return vol;
    }


    //toString
    public String toString() {
        return "Cylinder with base " + base +  " and height " + height;
    }

}
