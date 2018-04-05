public class Excercise3 {
    public static void printReverse(String input){

        if(input.length() == 0) System.out.println("done");
        else {
            System.out.println(input.substring(input.length()-1));
            printReverse(input.substring(0,input.length()-1));
        }

    }
    public static String reverseString(String input){

        if(input.length() == 0) return "";
        else {
            return input.substring(input.length()-1) +
            reverseString(input.substring(0,input.length()-1));
        }

    }

    public static void main(String[] args) {
        printReverse("abcd");
    }

}
