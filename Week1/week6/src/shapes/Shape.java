package shapes;


public interface Shape {

    double computeArea();

    default int doubleSide(int side) {
        return side *2;
    }

    static int multilply(int one, int two)
    {
        return one * two;
    }

}
