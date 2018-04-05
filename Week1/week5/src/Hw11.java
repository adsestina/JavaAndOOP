import java.util.Arrays;
public class Hw11 {

    public static int[] rotateArray(int[] array) {
        int temp = array[array.length-1];
        for(int index = array.length-2; index >= 0; index--) {
            array[index+1] = array[index];
        }
        array[0]= temp;
        return array;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(rotateArray(test)));
    }
}

