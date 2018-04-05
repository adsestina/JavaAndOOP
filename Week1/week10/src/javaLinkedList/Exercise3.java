package javaLinkedList;
import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<>();
        lst.add("how");
        lst.add("are");
        lst.add("you");
        lst.add(1,"now");
        lst.set(lst.size()-1,"cow");
        lst.set(lst.size()-2, "brown");
        System.out.println(lst);
        for (String element : lst) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int counter = 0; counter < lst.size(); counter++) {
            System.out.print(lst.get(counter) + " ");
        }
        System.out.println();
        LinkedList<String> lst2 = new LinkedList<>();
        for (String element : lst) {
            lst2.add(element);
        }
        System.out.println(lst2);
        System.out.println(lst == lst2);
        System.out.println(lst.equals(lst2));

        Integer[] array = {2,4,6,4,2,2,2};
        LinkedList<Integer> lst3 = new LinkedList<Integer>(Arrays.asList(array));
        System.out.println(lst3);
        lst3.remove((Integer)2);
        System.out.println(lst3);
        while (lst3.contains(2)) {
        lst3.remove((Integer)2);
    }
        System.out.println(lst3);

    }
}
