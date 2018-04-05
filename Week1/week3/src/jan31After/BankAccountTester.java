package jan31After;

public class BankAccountTester {

    public static void main(String[] args) {

        Person jane = new Person("Jane Doe", "123 First Street", 124);
        Person sam = new Person("sam Doe", "123 First Street", 124);

        BankAccount janeAccount = new BankAccount(jane);
        System.out.println(janeAccount);
        BankAccount samAccount = new BankAccount(sam, 100);
        System.out.println(samAccount);
        //BankAccount.deposit(20);  //don't do this
       janeAccount.deposit(100);
//        System.out.println(janeAccount.getFee());
//        System.out.println(samAccount.getFee());
         BankAccount.updateFee(1);
         //janeAccount.updateFee(4);  // don't do this
//        System.out.println(janeAccount.getFee());
//        System.out.println(samAccount.getFee());
        //janeAccount.justTest();

    }
}
