public class PetTester {
    public static void main(String[] args) {
        Pet spot = new Pet("Spot","Dog",10);
        Pet spot2 = spot.copy();
        Pet spot3 = new Pet("Spot", "Dog", 12);
        Pet spot4 = spot;

        System.out.println(spot.equals(spot2));
        System.out.println(spot.equals(spot3));
        System.out.println(spot.equals(spot4));
    }
}
