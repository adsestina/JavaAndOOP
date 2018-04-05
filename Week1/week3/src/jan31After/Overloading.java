package jan31After;

public class Overloading {

    public static int sameName(int x) {
        return 1;
    }

    public static double sameName(int y, int a) {
        return 2;
    }

    public static void main(String[] args) {
        System.out.println(sameName(3));
    }
}
