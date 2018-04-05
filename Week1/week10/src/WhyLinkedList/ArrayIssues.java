package WhyLinkedList;

import java.util.Arrays;
/**
 * Created by Owner on 3/19/2017.
 */

public class ArrayIssues {

    public static void insertToArray(int[] inArray, int num, int position) {

        //Method 1
//        for (int index = inArray.length-1; index >= position; index--)
//            if (index > 0)
//                inArray[index] = inArray[index-1];
//        inArray[position] = num;

        //method2
//        System.arraycopy(inArray, position, inArray, position + 1, inArray.length - position - 1);
//        inArray[position] = num;

    }

    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        System.out.println(Arrays.toString(test));
        insertToArray(test, 100,4);
        System.out.println(Arrays.toString(test));

    }
}
