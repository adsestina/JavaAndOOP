package jan31After;

public class BankAccount {

    //instance variables
    private Person owner;
    private int accountNum;
    private double balance;
    private static double accountFee = 5;
    private static int nextID = 100;

    //constructor
    public BankAccount(Person name) {
//        owner = name;
//        this.accountNum = accountNum;
//        balance = 0;
       this(name, 0);
    }


// Overloaded constructor
 public BankAccount(Person name, double balance) {
        owner = name;
        this.accountNum = nextID++;
        this.balance = balance;

    }


//    public void updateAccount(String newName) {
//
//        owner.changeName(newName);
//    }

    public double getFee() {
        return accountFee;
    }

    private int justTest() {
        return 2;
    }

    //Deposit Method
    public void deposit(double amount) {
        System.out.println(justTest());
        balance += amount;
    }

    public static void updateFee(double newFee) {
        accountFee = newFee;

    }

    //Withdrawal Method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= (amount + accountFee) ;
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    //For Printing
    public String toString() {

        return owner + " has account " + accountNum + " with balance $" + balance;
    }

    public static void main(String[] args) {
        Person p1 = new Person("todd", "345 First", 23456 );

        BankAccount testAccount = new BankAccount(p1);
        testAccount.deposit(30);
    }

}
