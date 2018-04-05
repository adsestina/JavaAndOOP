import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        int x = input.nextInt();
        System.out.println("Please enter a whole number: ");
        int y = input.nextInt();
        System.out.println("Please enter a whole number: ");
        int z = input.nextInt();

        if (x >= y && y >= z && x != z)
            System.out.println("Your number are decreasing");

        else if (x <= y && y <= z && x != z)
            System.out.println("Your number are increasing");

        else
            System.out.println("False");

    }
}
