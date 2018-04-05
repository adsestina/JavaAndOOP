package mulitpleInterfaces;

/**
 * Created by Owner on 2/19/2017.
 */
public interface interface1 {

    default void foo(String input) {
        System.out.println("first : " + input);
    }
}
