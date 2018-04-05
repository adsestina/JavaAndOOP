import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {

    public static int[] countBuckets(int times) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int[] buckets = new int[10];
        for (int i =0; i < times; i++) {
            System.out.print("Enter an integer between 0 and 100: ");
            number = input.nextInt();
            buckets[number/10]++;
        }
        input.close();
        return buckets;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBuckets(5)));
    }
}
