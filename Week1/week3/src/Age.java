public class Age {

    public static String printAge(int years, String name) {
        return name + " is " + years + " years old.";
    }

    public static void main(String[] args) {
        String returnString = printAge(20, "Eric");
        int y = 15;
       // returnString = printAge(y, "Eric");

        //These won't work
//        returnString = printAge("Eric");
//        returnString = printAge("Eric", 20);
//        returnString = printAge(int x, "Eric");
        System.out.println(returnString);


    }

}
    