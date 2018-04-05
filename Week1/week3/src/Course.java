import java.util.ArrayList;
public class Course {
    private String courseDepartment;
    private int courseNumber;
    private int creditHours;



    public Course(String courseDepartment, int courseNumber, int creditHours) {
        this.courseDepartment = courseDepartment;
        this.courseNumber = courseNumber;
        this.creditHours = creditHours;

    }

    public Course copy() {
        return new Course(courseDepartment,courseNumber,creditHours);
    }

    public String courseName() {
        return courseDepartment;
    }

    public int courseID() {
        return courseNumber;
    }


    public boolean equals(Object obj) {
            if (obj instanceof Course) {
                Course otherCourse = (Course) obj;
                return courseDepartment.equals(otherCourse.courseDepartment)  &&
                        courseNumber == otherCourse.courseNumber &&
                        creditHours == otherCourse.creditHours;

            } else
                return false;
        }


    public String toString() {
        return " "+courseDepartment + " number " + courseNumber + " and is worth " + creditHours + " hours.";
    }
}
