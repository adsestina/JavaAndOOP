package stacks;

/**
 * Created by Owner on 3/26/2017.
 */

public class ErrorExample {

    public static void method2(int y) {
         int z = y /0;
    }

    public static void method1(int x) {
        method2(x);
    }

    public static void main(String[] args) {
        method1(10);
    }
}
