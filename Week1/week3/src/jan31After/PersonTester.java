package jan31After;

public class PersonTester {


    public static void testcopy()
    {
        Person roseBush = new Person("Rose Bush", "First Street", 5555555);
        Person roseBushEvilTwin = roseBush.copy();
        roseBushEvilTwin.changeName("HAHAHAHA!!!");
        System.out.println("roseBush = " + roseBush);
        System.out.println("evilTwin = " + roseBushEvilTwin);
    }

    public static void main(String[] args) {

//        Person jane = new Person("Jane Doe", "123 South Street", 1234567890);
//        System.out.println(jane);

        testcopy();



    }
}
