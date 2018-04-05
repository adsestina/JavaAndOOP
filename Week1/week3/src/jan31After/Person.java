package jan31After;

public class Person {

    //Instance Variables
    private String name;
    private String address;
    private int phone;
    //add static variable for fee


    //Constructor
    public Person(String name, String address, int phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void changeName(String newName) {

        name = newName;
    }

    public void copyName(Person otherPerson) {
        changeName(otherPerson.name);
    }

    //Return true if two people have the same name
    public boolean compareNames(Person otherPerson) {
        if (name.equals(otherPerson.name))
            return true;
        else
            return false;
    }

    public Person copy() {

        return new Person (name, address, phone);
    }


    //For Printing
    public String toString() {

      //  return name + " lives at " + address + " with phone " + phone;
        return name;
    }
}
