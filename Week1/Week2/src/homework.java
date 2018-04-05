public class homework {
    public static void main(String[] args) {

        System.out.println("Celssius | Fahrenheit");
        System.out.println("_________|___________");

        for (int i = 0; i <= 100; i += 10) {
            int fah = i * 9/5 + 32;

            System.out.println("    " + i + "   |     " + fah);
        }

    }
}
