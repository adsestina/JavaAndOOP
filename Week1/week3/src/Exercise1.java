public class Exercise1 {

//    public static String takeThree(String str1,String str2, String str3){
//        if(str1.compareTo(str2) < 0) {
//            if (str1.compareTo(str3) < 0) {
//                return str1;
//            }
//        } else {
//            if (str2.compareTo(str3) < 0) {
//                return str2;
//            }
//            else {
//                return str3;
//            }
//        }
//    }

    public static String takeThree(String str1,String str2, String str3){
        if(str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0) {
            return str1;
        } else if (str2.compareTo(str1) > 0 && str2.compareTo(str3) > 0) {
            return str2;
        } else {
            return str3;
        }
    }

    public static void main(String[] args) {
        System.out.println("Expect canaries: " + takeThree("apples","bags","canaries"));
        System.out.println("Expect zephyr: " + takeThree("zebra","zephyr","oranges"));
    }
}
