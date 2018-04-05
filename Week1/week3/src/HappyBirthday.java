public class HappyBirthday {

    //Method definition with a return type of String and no parameters
    public static String happy() {
        String out = "Happy Birthday to You! ";
        return out;
    }

    public static void singHappyBirthday(String person) {
        System.out.println(happy() + happy() + "Happy birthday dear "
                + person + ",\n" + happy());

    }



    public static void main(String[] args) {
        //Call singHappyBirthday - note that there are no arguments
//        String returnedString = happy();
//        System.out.println(returnedString);
       // System.out.println(happy());

       singHappyBirthday("Johnny");
    }

}
    