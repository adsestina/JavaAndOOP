import java.util.Scanner;

public class PoolInput {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please assign customer Pool");
        String newPool = input.next();
        System.out.println("Please enter the shape of your pool");
        String shape = input.next();
        System.out.println("Please enter the if your pool is a lined or concrete");
        String construction = input.next();
        System.out.println("What color is your water?");
        String waterColor = input.next();
        System.out.println("Do you see any algae growing on pool?");
        Boolean algea = input.nextBoolean();
        System.out.println("How many gallons of water is your pool?");
        int gallons = input.nextInt();



        Pool pool = new Pool(shape, construction, waterColor, algea, gallons);
        System.out.println("Hello " + newPool + " " + pool);
    }


}