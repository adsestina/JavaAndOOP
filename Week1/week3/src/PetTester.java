import java.util.Arrays;
public class PetTester {
    public static void main(String[] args) {
        Pet TomCat = new Pet("Flea", "Cat");
        Pet Tiger = new Pet("Tigger", "Tiger");
        Pet spot = new Pet("Spot", "Dog", 10);
        Pet spot2 = spot.copy();
        Pet spot3 = new Pet("Spot", "Dog", 12);
        Pet spot4 = spot;

        System.out.println(TomCat);
        TomCat.petpet();
        System.out.println(TomCat);
        System.out.println(Pet.petsCreated);
        System.out.println(Pet.returnNumber());
        System.out.println(TomCat);
        Pet newCat = TomCat.copy();
        System.out.println(Pet.petsCreated);
        System.out.println(TomCat);
        System.out.println(newCat);
        System.out.println(TomCat.equals(Tiger));
        System.out.println(spot.equals(spot2));
        System.out.println(spot.equals(spot3));
        System.out.println(spot.equals(spot4));

        Pet[] petarray = {spot, spot2, spot3, TomCat};
        Pet[] petarray2 = new Pet[5];
        petarray2[0] = new Pet("Spot","dog");
        petarray2[1] = new Pet("Goldie", "Fish");
        petarray2[2] = new Pet("Fluffy", "Rabbit");

    }
}
