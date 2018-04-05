import java.lang.reflect.Array;
import java.util.Random;
import java.util.Arrays;
public class Hw5p4 {

    public static int randomInt(int[] a) {

        int bottom = a[0];
        int top = a[a.length - 1];
        Random randomGenerator = new Random();
        int num;
        if(bottom > top) {
            num = randomGenerator.nextInt(bottom-top) + top;
        }else{
            num = randomGenerator.nextInt(top-bottom) + bottom;
        }
        return num;
    }

    public static int[] arrayReturn(int[] a, int b) {
        int[] createInt = new int[b];

        for (int i = 0; i < 4; i++) {
            createInt[i] = randomInt(a);

        }
        return createInt;
    }

    public static void main(String[] args) {
        int[] intArray = {5, 3, 4, 10, 12};
        int[] randomArray;
        int[] randomArray2 = {randomInt(intArray), randomInt(intArray), randomInt(intArray), randomInt(intArray)};
        randomArray = new int[4];
        for (int i = 0; i < 4; i++) {
            randomArray[i] = randomInt(intArray);
            System.out.println(Arrays.toString(randomArray));
        }

        System.out.println(Arrays.toString(randomArray2));
//        System.out.println(Arrays.toString(randomArray));
        System.out.println(Arrays.toString(arrayReturn(randomArray, 4)));


    }

}
