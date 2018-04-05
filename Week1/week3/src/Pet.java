public class Pet {

    public static int petsCreated = 0;
    private String name;
    private String type;
    private int timesPetted;

    public Pet(String name, String type) {

        this(name, type, 0);
    }

    public Pet(String name, String type, int timesPetted) {

        this.name = name;
        this.type = type;
        this.timesPetted = timesPetted;
        petsCreated++;
    }


    public void petpet() {
        timesPetted++;
    }

    public Pet copy() {
        return new Pet(name,type,timesPetted);


    }


    public static int returnNumber() {
        return petsCreated;

    }
    public boolean equals(Object obj) {
        if (obj instanceof Pet) {
            Pet other = (Pet) obj;
            return name.equals(other.name) &&
                    type.equals(other.type)  &&
                    timesPetted == other.timesPetted;
        } else {
            return false;
        }
    }


    public String toString() {

        return "Your pet name is " + name + " it is a " + type + " and has been been petted " + timesPetted + " times.";
    }
}
