public class Cylinder {

    private Circle base;
    private int height;

    public Cylinder(Circle base, int height) {

        this.base = base;
        this.height = height;

    }

    public double calculateVolume() {
        double vol = height * base.calculateArea();
        return vol;

    }

    public String toString() {

        return "Cylinder with bade " + base + " and height " + height;
    }


}
