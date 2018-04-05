
public class WorkStudyStudent  extends Student {

    private double hoursWorked;

    public WorkStudyStudent(String StudentName, int idNumber, Major studentMajor, double hoursWorked) {
        super (StudentName, idNumber,studentMajor);
        this.hoursWorked = hoursWorked;

    }

    public double totalHours(double hours) {
        return hoursWorked += hours;

    }

    public String toString() {
    return super.toString()+" has worked "+hoursWorked+" and had made $"+hoursWorked * 7.25;
    }
}
