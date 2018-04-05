public class BankAccount   {

    private static int nextId = 100;
    //instance variables
    private String owner;
    private int accountNum;
    private double balance;

    //constructors
    public BankAccount(String owner, int num, double bal) {
        this.owner = owner;
        accountNum = num;
        balance = balance;
    }

    public BankAccount(String owner) {
        this(owner,nextId++,0 );
    }

    //other methods
    public boolean equals(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount other = (BankAccount) obj;
            return owner.equals(other.owner) &&
                    accountNum == other.accountNum &&
                    balance == other.balance;
        } else return false;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

//    public int compareTo(BankAccount other) {
//        if (owner.compareTo(other.owner) == 0){
//            if (accountNum < other.accountNum) {
//                return -1;
//            } else if (accountNum > other.accountNum) {
//                return 1;
//            } else {
//                return 0;
//            }
//        } else {
//            return owner.compareTo(other.owner);
//        }

//    }


    //toString
    public String toString() {
        return owner + " with account "+ accountNum +" has balance of " + balance;
    }

}
    