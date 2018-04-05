package lambdaFunctions;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortStringandPrimitives {

	public static void main(String[] args) {
		// Try sorting
		
		Integer[] intArr = {10, 2, 5, 12, 7};
//		System.out.println(Arrays.toString(intArr));
//		Arrays.sort(intArr);
//		System.out.println(Arrays.toString(intArr));
		
		List<Integer> arrList = new ArrayList<Integer>(Arrays.asList(intArr));
		System.out.println(arrList);
		//Collections.sort(arrList);
		Collections.sort(arrList, (x,y)-> {
			                      if (y < x) return -1;
			                      else if (x < y) return 1;
			                      else return 0;
		                          });
		
		//Collections.sort(arrList, (x,y)->y-x);
		System.out.println(arrList);
		
	    String test = "abc";
	    test.compareToIgnoreCase("ABC");
		
		String[] strArr = {"zebra", "ape", "lion", "Monkey"};
		List<String> strList = new ArrayList<String>(Arrays.asList(strArr));
		System.out.println(strList);
		//Collections.sort(strList);
		Collections.sort(strList, String::compareToIgnoreCase);
		System.out.println(strList);

	}

}
