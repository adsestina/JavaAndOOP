public class Pool {

    private String shape;
    private String construction;
    private String waterColor;
    private Boolean algeaVisible;
    private int gallons;


    public Pool(String shape, String construction, String waterColor, Boolean algeVisible, int gallons) {
        this.shape = shape;
        this.construction = construction;
        this.waterColor = waterColor;
        this.algeaVisible = algeVisible;
        this.gallons = gallons;


    }

    public String toString() {
        return "You pool is shaped "+ shape + " it is a " + construction + " pool. The water color is " + waterColor +
                ". You have algea " + algeaVisible + ". Your pool is " + gallons + " gallons";

    }
}


