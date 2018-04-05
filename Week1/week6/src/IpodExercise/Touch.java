package IpodExercise;

public class Touch implements Price {
    //instance
    private int memory;

    public Touch(int memory) {
        this.memory = memory;
        }
   public double computePrice(){
        return 8 * memory;

    }

    public String toString() {
        return "Ipod Touch has a memory size of "+memory;
    }
}
