public class ExtraMathFunctions {

    public static double percentOf(int x, double y) {
        return x * y / 100;

    }

    public static double findPercent(double x, double y) {
        return x / y * 100;
    }

    public static void main(String[] args) {
        System.out.println(percentOf(20, 115));
        System.out.println(findPercent(100,200));
    }
}