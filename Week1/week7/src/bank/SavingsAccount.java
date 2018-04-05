package bank;

/**
 * Created by Owner on 2/17/2017.
 */

public class SavingsAccount extends BankAccount {

    //instance variables
    private static double TRANSACTION_FEE = 2.0;
    private double interestRate;

    //constructor
    public SavingsAccount(String name, double rate) {
        super(name);
        interestRate = rate;
    }



    //new methods -what is wrong with this
    public void addInterest() {
        //double interest = getBalance() *  interestRate / 100;
        //balance += interest;
    }

//    @Override
//    public int doSomething() {
//        return 1;
//    }

    //Withdrawal Method
//

    public String toString() {
        return super.toString() + " with interest rate " + interestRate;
    }




}
