public class ReturnError {

    //Why won't this compile?
    public static boolean badFunction(int int1) {
        if (int1 > 0) return true;
        else if (int1 < 0) return false;
       // else if (int1 == 0) return true;
        else return true;

    }


    public static void main(String[] args) {
        System.out.println(badFunction(1));
    }


}
    