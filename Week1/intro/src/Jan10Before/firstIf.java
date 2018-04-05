package Jan10Before;

import java.util.Scanner;

public class firstIf {
    public static void main(String[] args) {
        //Simple if statement

        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = input.nextInt();

        //See if it is positive and if so print that
        if (num > 0) {
            System.out.println("The number, " + num + ", is positive");
        }
    }     //end main method


}
    