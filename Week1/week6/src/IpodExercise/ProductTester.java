package IpodExercise;



public class ProductTester {

    public static void main(String[] args)  {
        Product classic1 = new Product(new Classic(160));
        Product touch1 = new Product(new Touch((32)));
        Product nano1 = new Product(new Nano(8));
        Product shuffle1 = new Product(new Shuffle(2));


        System.out.println(classic1 + "\n" + touch1 + "\n" +
                nano1 + "\n" + shuffle1 + "\n");


    }

}
    