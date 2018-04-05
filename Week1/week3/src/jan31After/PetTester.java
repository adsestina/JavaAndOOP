package jan31After;

public class PetTester {
    public static void main(String[] args) {
        Pet pet = new Pet("Rover", "dog");
        System.out.println(pet);
        pet.petPet(5);
        System.out.println(pet);
        //System.out.println(Pet.numberPets);
        Pet pet2 = new Pet("Whiskers", "cat");
        Pet pet3 = new Pet("Tigger", "tiger");
        //System.out.println(Pet.numberPets);
        System.out.println(Pet.returnNumber());
        Pet goldie = new Pet("goldie","fish",10);
        System.out.println(goldie);
        Pet newFish = goldie.copy();
        newFish.petPet(1);
        System.out.println("newFish:" + newFish);
        System.out.println("Goldie: " + goldie);

    }
}
