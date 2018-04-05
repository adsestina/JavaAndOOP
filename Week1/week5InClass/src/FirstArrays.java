import java.util.Arrays;
import java.util.Scanner;

public class FirstArrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//       double temp[];
        double[] temp;

        temp = new double[7];
        int datasize = 0;
        boolean done = false;

        while(!done) {
            System.out.println("Enter a number or q to quit: ");
            String inValue = input.next();
            if (inValue.equals("q")) {
                done = true;
            }else {


                temp[datasize] = Integer.parseInt(inValue);
                datasize++;
            }
        }
        System.out.println(Arrays.toString(temp));

//        temp[0] = 5.6;
//        System.out.println(temp[1]);
//        double[] temp = {3.2, 4.7, 8.9, 10.2, 7};
//        System.out.println(temp[4]);
//        System.out.println(temp.length);
//
//        for (double item : temp) {
//            item += 10;
//            System.out.print(item + " ");
//        }
//
//        System.out.println();
//        for (int index = 0; index < temp.length; index++) {
//            //temp[index] += 10;
//            System.out.print(temp[index] + " ");
//
//        }
//
//        System.out.println();
//        for (double item : temp)
//            System.out.print(item + " ");
//
//        System.out.println();
//        BankAccount[] arrayOfAccts = {new BankAccount("suzy",123), new BankAccount("ralph",987)};
//        System.out.println(arrayOfAccts[arrayOfAccts.length -1]);
//        String [] arrayOfStr = new String[5];
//        System.out.println(arrayOfStr[0]);



    }
}
