package jan31After;

public class BookTester {
    public static void main(String[] args) {
        Book java = new Book("Big Java", "Horstmann", 100);
        Book python = new Book("Python", "Dawson", 40);
        System.out.println(java);
        System.out.println(python);
        java = python;
        System.out.println(java);
        python.changePrice(10);
        System.out.println(java);
        System.out.println(python);
    }
}
