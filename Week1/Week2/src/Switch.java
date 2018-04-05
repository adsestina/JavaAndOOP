import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter grade between A - F");
        String letterGrade = input.next();
        switch(letterGrade) {
            case "A":
                System.out.println("You have a 4.0");
                break;
            case "B":
                System.out.println("You have a 3.0");
                break;
            case "C":
                System.out.println("You have a 2.0");
                break;
            case "D":
                System.out.println("You have a 1.0");
                break;
            case "F":
                System.out.println("You have a 0.0");
                break;
                default:
                    System.out.println("Invalid Choice");

        }
    }
}
