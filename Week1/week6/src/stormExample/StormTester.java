package stormExample;

public class StormTester {

    public static void main(String[] args) {
        //Test StormWarning
        StormWarning hurricane = new StormWarning("hurricane", 300);
        StormWarning tornado = new StormWarning("tornado", 120);
        StormWarning thunderstorm = new StormWarning("thunderstorm", 60);

        System.out.println(hurricane + "\n" + tornado + "\n" + thunderstorm);

    }

}
    