import java.util.ArrayList;


public class FirstArrayList {

    public static void main(String[] args) {
        ArrayList<String> lst1 = new ArrayList<>();
        lst1.add("hi");
        lst1.add("bye");
        String s1 = "sigh";
        lst1.add(s1);
        lst1.add("bye");
        System.out.println(lst1);
        lst1.remove("bye");
        lst1.remove(1);
        System.out.println(lst1);
        System.out.println(lst1.get(1));
        lst1.add(1,"nigh");
       System.out.println(lst1);
    }

}
