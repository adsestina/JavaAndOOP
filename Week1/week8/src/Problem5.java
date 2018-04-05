public class Problem5 {
    public static boolean find(String full, String sub) {
        if (sub.length() > full.length()) return false;
        else if(full.substring(0, sub.length()).equals(sub)) return true;
        else return find(full.substring(1), sub);

    }

    public static void main(String[] args) {
        System.out.println(find("abcdefg", "bc"));
        System.out.println(find("abcdefg", "dc"));
        System.out.println(find("mississippi", "sip"));
        System.out.println(find("mississippi", "done"));
        System.out.println(find("something", "som"));
        System.out.println(find("so", "som"));

    }
}
