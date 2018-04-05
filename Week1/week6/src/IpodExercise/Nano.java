package IpodExercise;

public class Nano implements Price {
    private int memory;

    public Nano(int memory) {
        this.memory = memory;
    }
    public double computePrice(){
        return 6 * memory / 1.2;

    }

    public String toString() {
        return "Ipod Nano has a memory size of "+memory;
    }
}
