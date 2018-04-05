package lambdaFunctions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BankAccountTester {

	public static void main(String[] args) {
		BankAccount[] arrayOfBA = new BankAccount[4];
		arrayOfBA[0] = new BankAccount("Suzy",898);
		arrayOfBA[1] = new BankAccount("Jack", 123);
		arrayOfBA[2] = new BankAccount("Abe", 756);
		arrayOfBA[3] = new BankAccount("Abe", 598);
		
		ArrayList<BankAccount> ba = new ArrayList<BankAccount>(Arrays.asList(arrayOfBA));

		System.out.println(Arrays.toString(arrayOfBA));
//		Arrays.sort(arrayOfBA, (first, second)-> first.getOwner().compareTo(second.getOwner()));
		
//		Arrays.sort(arrayOfBA, (first, second)-> {
//			                       if (first.getOwner().compareTo(second.getOwner()) == 0) {
//			                    	   if (first.getNumber() < second.getNumber())
//			                    		   return -1;
//			                    	   else if (first.getNumber() > second.getNumber())
//			                    		   return 1;
//			                    	   else return 0;
//			                       } else return first.getOwner().compareTo(second.getOwner());
//
//		                          });
		
		System.out.println(Arrays.toString(arrayOfBA));
		
		Collections.sort(ba,(first, second)-> first.getOwner().compareTo(second.getOwner()) );
	}

}
