package bank;

/**
 * Created by carolyn.brodie on 1/23/2017.
 */
public class BankAccountTester {

    public static void main(String[] args) {

        BankAccount janeAccount = new BankAccount("Jane Doe", 101);
//        System.out.println(janeAccount);
//        BankAccount joeAccount = new BankAccount("Joe");
//        System.out.println(joeAccount);
//        BankAccount suzyAccount = new BankAccount("Suzy Que", 151, 150.50);
//        System.out.println(suzyAccount);
//        joeAccount.deposit(75.10);
//        joeAccount.withdraw(24.24);
//        System.out.println(joeAccount);

        SavingsAccount teddyAccount = new SavingsAccount("Teddy", .1 );
//        System.out.println(teddyAccount);

        //System.out.println("Jane " + janeAccount.doSomething());
      //  System.out.println("Teddy " + teddyAccount.doSomething());


    }
}
