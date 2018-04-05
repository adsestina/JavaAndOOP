package jan31After;

public class Exercise2 {

    public static int func(int x, double y) {
        return 1;
    }

    public static int func(int x, String y) {
        return 2;
    }

    public static int func(double x, int y) {
        return 3;
    }

//    public static double func(int x, double y) {
//        return 4;
//    }

    public static void main(String[] args) {
        func(1.0,1);
    }
}
