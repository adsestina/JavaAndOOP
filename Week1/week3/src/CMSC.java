import java.util.ArrayList;
public class CMSC implements Major {


    public boolean qualifyForMajor(ArrayList<Course> courses) {
            int count = 0;
            for (Course item : courses) {
                if (item.courseName().equals("CMSC") && item.courseID() >= 300 && courses.contains(300)) count++;
            }
            if (count < 3) {
                return true;
            }else{
                return false;
            }
        }
    public String toString() {
            return "CMSC";
    }
}