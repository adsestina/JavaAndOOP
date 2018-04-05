package javaLinkedList;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class exercise {
    public static void main(String[] args) {
//
//        LinkedList<String> lst = new LinkedList<>();
//        lst.add("how");
//        lst.add("are");
//        lst.add("you");
//        lst.add(1, "now");
//        lst.set(lst.size() - 1, "cow");
//        lst.set(lst.size() - 2, "brown");
//        System.out.println(lst);
//        for (String element : lst) {
//            System.out.println(element + " ");
//        }
//        System.out.println();
//        for (int counter = 0; counter < lst.size(); counter++)
//            System.out.println(lst.get(counter) + " ");
//    }
//
//    LinkedList<String> lst2 = new LinkedList<>();
//    for()
        Integer[] array= {2,4,6,4,2};
        LinkedList<Integer> lst3 = new LinkedList<>(Arrays.asList(array));
        System.out.println(lst3);
        lst3.remove(2);
        System.out.println(lst3);

    }

}
