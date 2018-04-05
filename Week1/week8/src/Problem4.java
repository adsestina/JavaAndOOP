public class Problem4 {

    public static int printNumbers(int n) {
        int sum = 0;
        if (n <= 0) return 0;
        else return n + printNumbers(n - 1) + sum;

        }



    public static void main(String[] args) {
        System.out.println(printNumbers(5));

    }
}
