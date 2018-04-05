import java.util.ArrayList;
public class Student {
    private String studentName;
    private int idNumber;
    private ArrayList<Course> courseList;
    private Major studentMajor;

    public Student(String studentName, int idNumber, Major studentMajor) {

        this.studentName = studentName;
        courseList=new ArrayList<Course>();
        this.idNumber = idNumber;
        this.studentMajor = studentMajor;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;

    }

    public void addCourse(Course course) {
        if(courseList.size()< 4 && !courseList.contains(course)) {
            courseList.add(course);
        }
        }
    public void removeCourse(Course course) {
        if(courseList.contains(course))
            courseList.remove(course);
    }
    public boolean precedesById(Student nextStudent) {
        if(idNumber < nextStudent.idNumber) {
            return true;
        } else {
            return false;
        }
    }

    public void nameChange(String newName) {
        studentName = newName;
    }

    public String toString() {
        String out = " ";
        if (studentMajor.qualifyForMajor(courseList)) {
            out = out + "Student qualifies for selected major. ";
        } else {
            out = out + "Student has not competed enough courses. ";
        }
        for (Course course : courseList) {
            out += course;
        }


        if(courseList.isEmpty()) {
            out += " is not registered for any classes. ";
            return studentName + " is a Student with ID number " + idNumber +". "+ out;
        }else if (courseList.size() < 3) {
            out += " Are students scheduled courses. ";
            return studentName + " is a part time student with ID number " + idNumber+ ". "+ out;
        }else{
            out += " Are students your scheduled courses. ";
            return studentName + " is student with ID number " + idNumber + out;
        }
    }


}
