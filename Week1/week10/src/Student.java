import java.util.ArrayList;

public class Student implements Comparable<Student> {
    private String studentName;
    private int idNumber;
    private ArrayList<Course> courseList;
    private Major studentMajor;

    public Student(String studentName, int idNumber, Major studentMajor) {

        this.studentName = studentName;
        courseList = new ArrayList<>();
        this.idNumber = idNumber;
        this.studentMajor = studentMajor;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;

    }

    public void addCourse(Course course) {
        if (courseList.size() < 4 && !courseList.contains(course)) {
            courseList.add(course);
        }
    }

    public void removeCourse(Course course) {
        if (courseList.contains(course))
            courseList.remove(course);
    }

    public boolean precedesById(Student nextStudent) {
        if (idNumber < nextStudent.idNumber) {
            return true;
        } else {
            return false;
        }
    }

//        public int compareTo(Student otherStudent) {
//            if (idNumber > otherStudent.idNumber) {
//                return -1;
//            }
//        }
//
//    public int compareTo(Student otherStudent) {
//        if (idNumber < otherStudent.idNumber) {
//            return 1;
//        }
//    }


    //    public int compareTo(Student otherStudent) {
//        int studentCompare = this.studentName.compareTo(otherStudent.studentName);
//            return studentCompare;
//
//
//        }
    public int compareTo(Student otherStudent) {
        int studentCompare = studentName.compareTo(otherStudent.studentName);
        if (studentCompare == 0) {
            if (idNumber > otherStudent.idNumber) {
                return -1;
            } else if (idNumber < otherStudent.idNumber) {
                return 1;
            } else {
                return 0;

            }
        } else return (studentName.compareTo(otherStudent.studentName));

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
