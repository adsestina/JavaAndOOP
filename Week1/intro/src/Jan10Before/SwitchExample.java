package Jan10Before;

public class SwitchExample {
    public static void main(String[] args) {
        String foodGrade = "GradeA";

        switch(foodGrade) {
            case "GradeA":
                System.out.println("30 cents per lb.");
                break; //The break statement causes program control to proceed 		   // with the first statement after the switch.
            case "GradeB":
                System.out.println("20 cents per lb.");
                break;
            case "GradeC":
                System.out.println("15 cents per lb.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }

}
    