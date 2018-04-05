import java.util.Scanner;

public class Pool {
    private String shape;
    private String construction;
    private String waterColor;
    private Boolean algeapresent;
    private int gallons;

    public Pool(String shape, String construction, String waterColor, Boolean algeapresent, int gallons) {
        this.shape = shape;
        this.construction = construction;
        this.waterColor = waterColor;
        this.algeapresent = algeapresent;
        this.gallons = gallons;

    }

    public String toString() {

        return shape + construction + waterColor + algeapresent + gallons;
    }


}
