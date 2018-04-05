import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        Pet[] petArray = new Pet[5];
        petArray[0] = new Pet("Spot","dog");
        petArray[1] = new Pet("Goldie","fish");
        petArray[2] = new Pet("Fluffy", "rabbit");

        Pet[] petArray2 = {new Pet("Spot","dog"),new Pet("Goldie","fish") };


        System.out.println("1 " + petArray);
        System.out.println("2 " + petArray.toString());
        System.out.println("3 " + Arrays.toString(petArray));
        for (Pet pet : petArray) System.out.println(pet);
        System.out.println();
        for (int count = 0; count < 3; count++) System.out.println(petArray[count]);


    }

}
    