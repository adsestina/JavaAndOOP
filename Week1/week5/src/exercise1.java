public class exercise1 {

    public static void main(String[] args) {
        int x = 4;
        int y = 7;
        double[] a = new double[y];
        System.out.println(a[y - x]); //0.0
        System.out.println(a[x + y/2]); // out of bounds
        int[]c;                 //
//        System.out.println(c[0]); declared but not initialized
    }
}

