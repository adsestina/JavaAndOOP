public class IterationThruArrays {
    public static void main(String[] args) {
        int[] intArray = {5,3,4,10,12};

        //for loop
        for (int index = 0; index < intArray.length; index++) {
            System.out.print(intArray[index] + " ");
        }

        System.out.println();

        //while loop
        int index = 0;
        while (index < intArray.length) {
            System.out.print(intArray[index] + " ");
            index++;
        }

        System.out.println();

        //for each loop
        for (int element : intArray) {
            System.out.print(element + " ");
        }
    }

}
    