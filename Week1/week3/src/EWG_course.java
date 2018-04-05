public class EWG_course extends Course {
    private String location;
    public EWG_course(String courseDepartment, int courseNumber, int creditHours, String location) {
        super (courseDepartment, courseNumber, creditHours);
        this.location = location;


    }

    public String toString() {
        return super.toString()+ " Is an EWG in "+location;
    }
}
