import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;


public class exerciseProb4 {

    public static void swapValues(List<Integer> lst, int first, int second) {
        if(lst.contains(first) && lst.contains(second)) {
            int index1 = lst.indexOf(first);
            int index2 = lst.indexOf(second);
            lst.set(index1, second);
            lst.set(index2, first);
//            int temp = lst.get(index1);
//            lst.set(index1, lst.get(index2));
//            lst.set(index2, temp);
        }
    }
    public static void main(String[] args) {
        Integer[] x = {5,8,3,2,9};
        ArrayList<Integer> arrLst = new ArrayList<>();
        LinkedList<Integer> Llst = new LinkedList<>((Arrays.asList(x)));
        System.out.println(arrLst);
        swapValues(arrLst, 8, 9);
        System.out.println(arrLst);
        swapValues(Llst, 8,9);
        System.out.println(Llst);

    }
}
