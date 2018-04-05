package lambdaFunctions;

import java.util.function.*;

public class Example {

	public static int sumOfSquares(int n)
	{
		int total = 0;
		for (int count = 0; count <= n; count++) 
			total += count * count;
		return total; 
	}
	
	public static int sumOfCubes(int n)
	{
		int total = 0;

		for (int count = 0; count <= n; count++) 
			total += (count * count * count);
		return total; 
	}
	
	public static int sumOfAnything(Function<Integer,Integer> func, int n) 
	{
		int total = 0;
		for (int count = 0; count <= n; count++) 
			total += func.apply(count);
		return total;  
	}

	public static double tryIt (BiFunction<Integer,Integer, Double> func, int num1, int num2) {
	    return func.apply(num1,num2);
    }

    public static int square (int x) {
	    return x * x;
    }


	public static void main(String[] args) {
		
		System.out.println(sumOfSquares(2));
		System.out.println(sumOfCubes(2));
		System.out.println(sumOfAnything(x->x, 2));
		System.out.println(sumOfAnything(x->x * x, 2));
		System.out.println(sumOfAnything(x->x*x*x, 2));
        System.out.println ("Method Reference: " + tryIt(Math::pow, 2,3));
        System.out.println ("Lambda : " + tryIt((x,y)->x + y * 5.0, 2,3));
        System.out.println (sumOfAnything(Example::square, 4));


	}

}
