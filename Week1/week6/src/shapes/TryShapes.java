package shapes;

public class TryShapes {

    public static Square findBiggestSquare(Square[] squares){
        Square largestSquare = squares[0];

        for (Square square: squares)
            if (square.computeArea() > largestSquare.computeArea())
                largestSquare = square;

        return largestSquare;
    }


//    public static Triangle findBiggestTriangle(Triangle[] triangles) {
//
//        Triangle largestTriangle = triangles[0];
//
//        for (Triangle triangle: triangles)
//            if (triangle.computeArea() > largestTriangle.computeArea())
//                largestTriangle = triangle;
//
//        return largestTriangle;
//    }
//
//    //using the interface
    public static Shape findBiggest(Shape[] shapes) {
        Shape largestShape  = shapes[0];
        for (Shape shape: shapes) {
            if (shape.computeArea()> largestShape.computeArea())
                largestShape = shape;
        }

        return largestShape;
    }


    public static void main(String[] args) {


       Square[] sqArray  = {new Square(5), new Square(2), new Square(7), new Square(1)};

        System.out.println("Biggest square " +  findBiggestSquare(sqArray));
        //Triangle[] triArray = {new Triangle(4,3), new Triangle(1,2)};
        //System.out.println("Biggest triangle" + findBiggestTriangle(triArray));

//        Square sq1 = new Square(3);
//        System.out.println("Call doubleSide " + sq1.doubleSide(sq1.returnSide()));
//        Triangle t1 = new Triangle(3,3);
//        System.out.println("Call doubleSide " + t1.doubleSide(t1.returnHgt()));


//        //Use the interface
        Shape[] shapeArray = {new Square(4), new Triangle(3,4), new Square(6), new Circle(3)};
        System.out.println("Biggest Shape " + findBiggest(shapeArray));



    }
}
