import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String accum = "";
        boolean done = false;

        do {
            System.out.println("Please enter a word enter -99 to quit");
            String inValue = input.next();
            if (inValue.equals("-99")) {
                done = true;
            } else {
                accum += inValue;
            }

        }
        while (!done);
        System.out.println(accum.length());;
    }

}


