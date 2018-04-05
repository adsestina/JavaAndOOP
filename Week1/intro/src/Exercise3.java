import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area = 0;
        double areaOfSlice = 0;
        System.out.println("Enter a diameter = ");
        int diameter = input.nextInt();
        System.out.println("Enter number of slices = ");
        int slices = input.nextInt();
        area = Math.pow(diameter / 2.0, 2) * Math.PI;
        areaOfSlice = area / slices;


        System.out.println(areaOfSlice);

    }
}
