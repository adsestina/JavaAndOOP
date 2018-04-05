package IpodExercise;

public class Classic implements Price{
    private int memory;

    public Classic(int memory) {
        this.memory = memory;
    }
    public double computePrice(){
        return 10 * memory + 50;

    }

    public String toString() {
        return "Ipod Classic has a memory size of "+memory;
    }
}

