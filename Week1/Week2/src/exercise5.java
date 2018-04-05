public class exercise5 {
    public static void main(String[] args) {
        int i = 5;
        int total = 0;
        int x = 5;
        int newTotal = 0;

        while (i <= 25) {
            total += i;
            i++;
        }
        System.out.println(total);


        do {
            newTotal += x;
            x++;

        } while (x <= 25);
        System.out.println(newTotal);
    }
}



