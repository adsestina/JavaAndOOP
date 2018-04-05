/**
 * Created by carolyn.brodie on 2/1/2017.
 */
public class Pet {

    private static int numberPets = 0;

    //instance variable
    private String name;
    private String type;
    private int  timesPetted;

    public Pet(String name, String type) {
//        this.name = name;
//        this.type = type;
//        timesPetted = 0;
//        numberPets++;
        this(name,type,0);
    }

    public Pet(String name, String type, int times) {
        this.name = name;
        this.type = type;
        timesPetted = times;
        numberPets++;
    }

    public static int returnNumberPets() {

        return numberPets;
    }



    public Pet copy() {
        return new Pet(name,type,timesPetted);
    }


    public  String toString() {

        return name  + " is a " + type + " and has been petted " + timesPetted + " times.";
    }

    public void petPet() {

        timesPetted++;
    }

}
