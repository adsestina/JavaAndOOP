import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount[] array = {new BankAccount("Ted"),new BankAccount("Suzy"), new BankAccount("Ted", 123, 100)};

        ArrayList<BankAccount> lst = new ArrayList<>(Arrays.asList(array));
        System.out.println(lst);
//        Collections.sort(lst);
//        System.out.println(lst);

    }

}
    