public class Hi {
    public static String twoStrings(String a, String b, int n) {
        String NewString = "";
        for (int i = 0; i < n; i++) {
            NewString += b;
        }
       return a + NewString;

}


    public static void main(String[] args) {
        System.out.println(twoStrings("hi","lo", 7));

    }
}
