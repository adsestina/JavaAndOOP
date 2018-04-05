package sets;

public class BankAccount {
	
	//instance variable
	private String owner;
	private double balance;
	
	//constructor
	public BankAccount(String owner) {
		this.owner = owner;
		balance = 0;
	}
	
	public String toString() {

		return owner + " has a balance of " + balance;
	}
	
	public boolean equals (Object obj) {
		if (obj instanceof  BankAccount) {
			BankAccount acct = (BankAccount)obj;
			if (owner.equals(acct.owner) &&
				balance == acct.balance)
				return true;
			else return false;
		} else return false;
	}
	
	public int hashCode() {
		final int HASH_MULTIPLIER = 31;
		int h1 = owner.hashCode();
		int h2 = new Double(balance).hashCode();
		return HASH_MULTIPLIER * h1 + h2;
	}
	
	public void deposit(double amt) {
		balance += amt;
	}

}
