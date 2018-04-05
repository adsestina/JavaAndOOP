package jan31After;

public class Pet {
    //instance variables
    private static int numberPets =0;
    private String name;
    private String type;
    private int timesPetted;

    //constuctor
    public Pet(String name, String type) {
        this(name,type,0);
//        this.name = name;
//        this.type = type;
//        timesPetted = 0;
//        numberPets++;
    }

    public Pet(String name, String type, int timesPetted) {
        this.name = name;
        this.type = type;
        this.timesPetted = timesPetted;
        numberPets++;
    }

    //other methods
    public static int returnNumber() {
        return numberPets;
    }

    public void petPet(int number) {
        timesPetted += number;
    }

    public Pet copy() {
        return new Pet(name, type, timesPetted);
    }

    //toString
    public String toString() {
        return name + " is a " + type + " and has been petted " + timesPetted + " times";
    }

}
