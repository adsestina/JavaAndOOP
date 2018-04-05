package IpodExercise;

public class Shuffle implements Price{
    private int memory;

    public Shuffle (int memory) {
        this.memory = memory;
    }
    public double computePrice(){
        return 5 * memory / 1.8;

    }

    public String toString() {
        return "Ipod Shuffle has a memory size of "+memory;
    }
}
