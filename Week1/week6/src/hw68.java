import java.util.Arrays;
public class hw68 {
    public static boolean checkArray(float a, float b, int[] array) {
        for (int x : array) {
            if (a < x && b >= x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
    int[] myArray = { 6, 8, 9, 10, 24, 33};
        System.out.println(checkArray(4, 5, myArray));
}
}