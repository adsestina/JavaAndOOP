import java.util.Arrays;
import java.util.Random;

public class TryRandomNumbers {

    //Method to return an array of n numbers between 1 and 100
    public static int[] createRandomArray(int n) {
        int[] out = new int[n];
        int top = 5;
        int bottom = 1;
        Random rand = new Random();
        for (int count = 0; count < out.length; count++) {
            out[count] = rand.nextInt(top - bottom) + bottom;
        }
        return out;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(createRandomArray(5)));
    }

}
    