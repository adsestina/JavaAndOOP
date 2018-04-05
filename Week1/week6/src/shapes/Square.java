package shapes;


public class Square  implements Shape {

    //instance variable
    private int side;

    public Square(int side) {

        this.side = side;
    }

    public double computeArea() {
        return Math.pow(side,2);
    }

    public int returnSide() {
        return side;
    }

//    @Override
//    public int doubleSide(int side) {
//        return side *3;
//    }

//    @Override
//    public boolean equals(Square otherSquare) {
//        return side == otherSquare.side;
//    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Square) {
//            Square otherSquare = (Square)obj;
//            return side == otherSquare.side;
//        } else
//            return false;
//    }

     public String toString() {
        return "Square with side " + side;
     }
}
