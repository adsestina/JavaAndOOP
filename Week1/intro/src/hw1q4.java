import java.util.Scanner;

public class hw1q4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        b = (a == b++) ? b - 1 : a + 1;
        System.out.println(b);
    }
}
