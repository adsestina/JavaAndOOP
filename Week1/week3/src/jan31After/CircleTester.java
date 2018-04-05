package jan31After;

public class CircleTester {

    public static void main(String[] args) {
        Circle circle1 = new Circle(4);
//        System.out.println(circle1);
//        System.out.println("area is " + circle1.calculateArea());
        Cylinder cyl1 = new Cylinder(circle1, 10);
        System.out.println(cyl1);
        System.out.println("Volume: " + cyl1.calculateVolume());
    }
}
