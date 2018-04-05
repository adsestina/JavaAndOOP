import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.


public class Problem9 {
    public static List<Integer> createList(int length) {
        List<Integer> largeList= new ArrayList<>();
        for (largeList.add((int) (length * Math.random() - length + 5));
             // I need to work on this one..

    }

    public static List<Integer> removeNegative(List<Integer> listName) {
        Iterator itr = listName.iterator();

        while (itr.hasNext()) {
            int i = (Integer) itr.next();
//            System.out.print(i + " ");
            if (i < 0)
                itr.remove();
        }

        return listName;
    }

    public static void main(String[] args) {
        List<Integer> lst  = new ArrayList<>();
        lst.add(1);
        lst.add(-30);
        lst.add(-9);
        lst.add(10);
        lst.add(5);
        removeNegative(lst);
        System.out.println(lst);

    }
}


