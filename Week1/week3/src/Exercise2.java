import java.util.Scanner;

public class Exercise2 {

    public static int countNumbers() {
        Scanner input = new Scanner(System.in);
        int accum = 0;
        String inValue = "";
        boolean done = false;
        do {
            System.out.print("Enter an integer or Q to quit: ");
            inValue = input.next();
            if (inValue.equalsIgnoreCase("Q")) {
                done = true;
            } else {
                int num = Integer.parseInt(inValue);
                if (num > 10 && num < 15) {
                    accum++;
                }
            }

        } while(!done);
        return accum;
    }

    public static void main(String[] args) {
        System.out.println(countNumbers());
    }
}
