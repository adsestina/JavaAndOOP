import java.util.Scanner;
import java.util.Arrays;
public class exercise {


    public static int[] countBuckets(int times) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int[] buckets = new int[10];
        for (int i = 0; i < times; i++) {
        System.out.println("Enter an interger between 0 and 100: ");
        number = input.nextInt();
        buckets[number / 10]++;

    }
    input.close();
    return buckets;


}

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBuckets(5)));
    }
    }