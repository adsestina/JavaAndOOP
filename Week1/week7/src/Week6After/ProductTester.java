package Week6After;



public class ProductTester {

    public static void main(String[] args)  {
        Classic cl1 = new Classic(160);
        Nano n1 = new Nano(8);
        Shuffle sh1 = new Shuffle(2);
        Product classic1 = new Product(cl1);
        Product touch1 = new Product(new Touch(32));
        Product nano1 = new Product(n1);
        Product shuffle1 = new Product(sh1);


        System.out.println(classic1 + "\n" + touch1 + "\n" +
                nano1 + "\n" + shuffle1 + "\n");


    }

}
    