package lambdaFunctions;

public class BankAccount {
	
	//instance variables
	private String owner;
	private int idNum;
	private double balance;
	
	//constructor
	public BankAccount(String name, int id) {
		owner = name;
		idNum = id;
		this.balance = 0;
	}
	
	//equals Method
	public boolean equals(Object obj) {
		if (obj instanceof BankAccount) {
			BankAccount otherAccount = (BankAccount) obj;
			if (owner.equals(otherAccount.owner) &&
				idNum == otherAccount.idNum &&
				balance == otherAccount.balance) {
				return true;
			} else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	//return owner
	public String getOwner() {
		return owner;
	}
	
	public int getNumber() {
		return idNum;
	}
	
	
	//deposit
	public void deposit(double amount) {
		balance += amount;
	}
	
	//toString
	public String toString() {
		String out = "Bank Account " + idNum + " owned by " + owner;
		out = out + " with balance " + balance;
		return out;
	}

}
