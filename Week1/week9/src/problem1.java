import java.util.Arrays;
import java.util.Random;

public class problem1 {

    public static int selectionSort(int[] data) {

        int min;
        int temp;
        int count = 0;

        for (int index = 0; index < data.length - 1; index++) {
            min = index;
//            count++;
            /* Find the minimum element from position index */
            for (int scan = index + 1; scan < data.length; scan++) {
                count++;
                if (data[scan] < (data[min])) min = scan;
                /* Swap the values */
                temp = data[min];
                data[min] = data[index];
                data[index] = temp;
            }
        } return count;
    }

    public static int [] randomArray(int number) {
        int [] newArray = new int[number];
        Random randomGenerator = new Random();
        for(int i = 0; i < number; i++) {
        newArray[i]=randomGenerator.nextInt(100-0) + 0;;
        }
        return newArray;


    }

    public static void main(String[] args) {
        int [] dat1 = {90,8,7,56,88,1,25,89,50,15};
        System.out.println(selectionSort(dat1));
        System.out.println(Arrays.toString(randomArray(9)));


    }
}
