import java.util.ArrayList;

public class Exercise5 {
    public static void main(String[] args) {
        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(2.5);
        list1.add(3.5);
        list1.add(4.5);
        list1.add(5.5);
        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(19.1);
        list2.add(20.1);

//        for (int i = 0; i < list1.size(); i++) {
//            list2.add(list1.get(i));
//        }
        for (Double element : list1) {
            list2.add(element);
        }
        System.out.println(list2);
    }
}
