public class ReturnTypes {

        public static int addNumbers(int num1, int num2) {
            //num1 and num2 are parameters - there values are passed in
            int total= 0;  //this is a local variable
            total = num1 + num2;
            return total;
        }

        public static String concatenateString(String st1, String st2) {
            return st1 + st2;

        }

        public static void printMessage(String st1, int number1) {
            String out = "";
            out = st1 + (number1 + 4);
            System.out.println(out);
        }


    public static void main(String[] args) {
//        int returnInt = addNumbers(2,3);  // 2 and 3 are arguments that match num1 and num2
//        System.out.println(returnInt);
//        System.out.println(addNumbers(4,5));
        //System.out.println(concatenateString("abc","def"));
        printMessage("hi",4);




    }
}
    