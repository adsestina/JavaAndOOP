package mulitpleInterfaces;

/**
 * Created by Owner on 2/19/2017.
 */
public interface interface2 {

    default void foo(String input) {
        System.out.println("Second : " + input);
    }
}
