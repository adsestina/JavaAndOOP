package bank;

/**
 * Created by carolyn.brodie on 1/23/2017.
 */
public class BankAccount {

    //static instance variables
    private static int nextNum = 1000;


    //instance variables
    private String owner;
    private int accountNum;
    private double balance;

    //constructors
    public BankAccount(String name) {

        this(name, nextNum++, 0);
    }

    public BankAccount(String name, int accountNum) {

        this(name, accountNum, 0);
    }


    public BankAccount(String name, int accountNum, double balance) {
        owner = name;
        this.accountNum = accountNum;
        this.balance = balance;

    }


    //Deposit Method
    public void deposit(double amount) {

        balance  += amount;
    }

    //Withdrawal Method
    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

//    public int doSomething() {
//        return 0;
//    }


    public double getBalance() {
        return balance;
    }

    //For Printing
    public String toString() {
        return owner + " has account " + accountNum + " with balance $" + balance;
    }


}
