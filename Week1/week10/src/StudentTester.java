import java.util.ArrayList;
import java.util.Arrays;

public class StudentTester {
    public static void main(String[] args) {
        Course art = new Course("Art", 160, 4);
        Course math120 = new Course("Math", 120, 4);
        Course math255 = new Course("Math", 255, 4);
        Course math340 = new Course("Math", 340, 4);
        Course math355 = new Course("Math", 355, 4);
        Course cmsc225 = new Course("CMSC", 225,4);
        Course cmsc360 = new Course("CMSC", 360,4);
        Course cmsc355 = new Course("CMSC", 355,4);
        Course cmsc400 = new Course("CMSC", 400,4);
        Course science = new Course("Science", 150, 4);
        Course history = new Course("History", 135, 4);
        Student adam = new Student("Adam Sestina", 7701709, new CMSC());
        Student christine = new Student("Christine Sestina",440987, new CMSC());
        Student jameson = new Student("Jameson Sestina", 82222016, new Math());
        Student [] studentArray = {adam, jameson, christine};
        Arrays.sort(studentArray);
        System.out.println(studentArray);

        //        adam.addCourse(math120);
//        adam.addCourse(math340);
//        adam.addCourse(math120);
//        adam.addCourse(science);
//        adam.removeCourse(history);
//        christine.addCourse(math120);
//        christine.addCourse(cmsc360);
//        christine.addCourse(math340);
//        christine.addCourse(cmsc225);
//        jameson.addCourse(math120);
//        System.out.println(adam);
//        System.out.println(christine);
//        System.out.println(jameson);
//        WorkStudyStudent jameson = new WorkStudyStudent("Jameson Sestina",77218, new CMSC(), 24);
//        jameson.addCourse(math120);
//        jameson.addCourse(cmsc225);
//        jameson.removeCourse(math120);
//        jameson.addCourse(math340);
//        System.out.println(jameson);
//        EWG_course physics101 = new EWG_course("Physics",101,3,"Ankeny");
//        EWG_course biology101 = new EWG_course("Biology", 101, 3,"West Des Moines");
//        jameson.addCourse(biology101);
//        jameson.addCourse(physics101);
//        jameson.removeCourse(physics101);
//        System.out.println(jameson);
    }
}
