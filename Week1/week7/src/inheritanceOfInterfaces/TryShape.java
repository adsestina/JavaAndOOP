package inheritanceOfInterfaces;

public class TryShape {
	
	public static void test(Shape x) 
	{
		x.draw();
		x.computeArea();
	}

	public static void main(String[] args) {
		 
		RotatableShape y = new ShapeTest();
		Shape z = new ShapeTest();
		test(y);
		test(z);

	}

}
