package sorts; 
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PigeonSortExample {
	
	
	public static void pigeonHoleSort(int[] array, int max)
	{
		List<List<Integer>> pigeonHole = new ArrayList<>() ;
		
		for (int index = 0; index < max; index++)
			pigeonHole.add(new ArrayList<>());
		
		//go through array and put each element in the correct pigeon hole
		for (int index = 0; index < array.length; index++)
		{
			(pigeonHole.get(array[index])).add(array[index]);
		}
		
		//transfer back to list
		List<Integer> sorted = new ArrayList<>();
		for (List<Integer> lst : pigeonHole)
			if (lst.size() != 0)
				for (Integer element : lst)
					sorted.add(element);
		
		//put back in array
		for (int index = 0; index < array.length; index++)
			array[index] = sorted.get(index);
			
	}

	public static void main(String[] args) {
		
		int[] test = {1, 34, 5, 102, 3, 15, 87, 63,34};
		System.out.println(Arrays.toString(test));
		pigeonHoleSort(test, 103);
		System.out.println(Arrays.toString(test));
	}

}
