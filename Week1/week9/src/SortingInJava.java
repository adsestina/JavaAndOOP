import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingInJava {

    public static void main(String[] args) {
        int[] array = {2, -5, 3, 0, 7, -11};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        String[] stArray = {"CCC", "AAA","DDD","BBB"};
        ArrayList<String> lst = new ArrayList<>(Arrays.asList(stArray));
        System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);

    }

}
    