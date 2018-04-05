public class Hwq4 {
    public static boolean threeString(String a, String b, String c) {
        if (b.compareTo(a)> 0 && b.compareTo(c)<0) {
        return true;
        }else if (b.compareTo(a)<0 && b.compareTo(c)>0) {
            return true;
        } else if (b.compareTo(a)>0 && b.compareTo(c)>0) {
            return false;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(threeString("this","this","a that"));

    }
}
