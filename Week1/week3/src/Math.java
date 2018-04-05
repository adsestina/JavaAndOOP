import java.util.ArrayList;

public class Math implements Major {


    public boolean qualifyForMajor(ArrayList<Course> courses) {
        int count = 0;
        for (Course item : courses) {
            if (item.courseName().equals("Math")  && item.courseID() >= 200) count++;
        }

        if (count < 3) {
            return true;
        }else{
            return false;
        }
    }

    public String toString() {
        return "Math";
    }
}