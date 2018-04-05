package sets;
import java.util.Set;
import java.util.HashSet;

public class BankAccountTester {

	public static void main(String[] args) {
		Set<BankAccount> bankHash = new HashSet<BankAccount>();
		BankAccount acct1 = new BankAccount("Joe Doe");
		BankAccount acct2 = new BankAccount("Sam Spade");
		BankAccount acct3 = new BankAccount("Joe Doe");
		bankHash.add(acct1);
		bankHash.add(acct2);
		bankHash.add(acct3);

		System.out.println("Hash code for acct1: " + acct1.hashCode());
		System.out.println("Hash code for acct2: " + acct2.hashCode());
		//System.out.println("Hash code for acct3: " + acct3.hashCode());
		
		 Set<BankAccount> set = new HashSet<BankAccount>();
		 set.add(acct1);
		 set.add(acct2);
		 set.add(acct3);
		 System.out.println(set);


	}

}
