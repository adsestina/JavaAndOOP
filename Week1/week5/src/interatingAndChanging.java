import java.util.Arrays;

public class interatingAndChanging {
    public static void main(String[] args) {
        int[] intArray = {5,3,4,10,12};
        System.out.println("Beginning: " + Arrays.toString(intArray));
        //for loop
        for (int index = 0; index < intArray.length; index++) {
            intArray[index] += 10;
        }

        System.out.println("After for : " + Arrays.toString(intArray));

        //while loop
        int index = 0;
        while (index < intArray.length) {
            intArray[index] += 10;
            index++;
        }

        System.out.println("After while: " + Arrays.toString(intArray));

        //for each loop
        for (int element : intArray) {
            element += 10;
        }
        System.out.println("After for each: " + Arrays.toString(intArray));
    }

}
    