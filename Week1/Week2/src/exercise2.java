import java.util.Scanner;

public class exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an whole number");
        int x = input.nextInt();
        if (x % 2 == 0 && x % 5 == 0) {
            System.out.println(" Your value is divisible by 2 and 5");
        } else if (x % 2 == 0) {
            System.out.println("Your value is divisible by 2 and not 5");
        } else if (x % 5 == 0) {
            System.out.println("Your value is divisible by 5 and not 2");
        } else {
            System.out.println("Your value is not divisible by 5 or 2");

        }

    }
}



