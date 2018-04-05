import java.util.Arrays;

public class BookTester {

    public static void main(String[] args) {
        Book [] array = {new Book("The Giver", "Lowery", 18), new Book("Annilation", "bob", 34),
                new Book ("Altered Carbon", "Morgan", 12), new Book("Storm Front", "JuJu", 25)};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }

}
    