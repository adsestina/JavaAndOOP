import java.util.ArrayList;
public class exercise5 {
    public static void main(String[] args) {
        ArrayList<Double> lst1 = new ArrayList<Double>();
        ArrayList<Double> lst2 = new ArrayList<Double>();
        lst1.add(5.3);
        lst1.add(9.0);
        lst1.add(27.3);
        lst1.add(57.5);
        lst2.add(99.1);
        lst2.add(55.2);

//        for(int i = 0; i < lst1.size(); i++){
//            lst2.add(lst1.get(i));

        for (Double element : lst1) {
            lst2.add(element);

        }
        System.out.println(lst2);


    }
}
