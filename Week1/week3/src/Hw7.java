public class Hw7 {
    public static int findDivis(int n) {
        int j = 0;
        int x = n;
        while (n <= 100) {
            n += x;
            j++;
        }
    return  j;

    }

    public static void main(String[] args) {
        System.out.println(findDivis(3));
    }
}
