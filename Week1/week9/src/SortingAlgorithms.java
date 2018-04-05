import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SortingAlgorithms {
	
		private static int[] selectionSort(int[] data) 
		{ 
			for (int index = 0; index < data.length-1; index++) 
			{ 
			   // Find the index'th smallest element
			   int min = index; 
			   for (int scan = index + 1; scan < data.length; scan++) 
				    if (data[scan] < data[min]) min = scan; 
			   
			   if (min != index) // swap the elements
			   {
				  int temp = data[index]; 
				  data[index] = data[min];  
				  data[min] = temp;
			   }
			   //System.out.println(Arrays.toString(data)); // Just for demonstration purposes.
			} 
			
			return data;
		}


		//////////////////////////////////////////////////////////////////////////////////////////

		private static int[] insertionSort(int data[])
		{
			  for (int index = 1; index < data.length; index++)
			  {
				  int position = index;
				  int key = data[index];
				  
				  while ((position > 0) && (data[position - 1] > key))
				  {
					  data[position] = data[position - 1];
					  position--;
				  }
				  
				  data[position] = key;
				  //System.out.println(Arrays.toString(data)); // Just for demonstration purposes.
			  }
			  
			  return data;
		}
			


    /////////////////////////////////////////////////////////////////////////////////////////////////
		
		private static void mergeSort(int[] data) 
		{	
		    if (data.length <= 1) return;
			
		    int[] first = new int[data.length/2];
		    int[] second = new int[data.length - first.length];
			
		    // Put first half of data into first.
		    //for (int i = 0; i < first.length; i++) 
			// first[i] = data[i];
		    System.arraycopy(data, 0, first, 0, first.length);
			
		    // Put second half of data into second.
		    //for (int i = 0; i < second.length; i++) 
			 //second[i] = data[first.length + i];
		    System.arraycopy(data, first.length, second, 0, second.length);
			
		    //Recursion
		    mergeSort(first);
		    mergeSort(second);

		    // Combine the results.
		    merge(first, second, data);
		    //System.out.println(Arrays.toString(data)); // Just for demonstration purposes.
		}




		private static void merge(int[] first, int[] second, int[] merged) 
	    { // Merge two SORTED arrays into one sorted array.
			
			int indexFirst = 0;  // next element in first to consider
			int indexSecond = 0; // next element in second to consider
			int indexMerged = 0; // next position to fill in merged array
			
		   // Compare elements in first and second and put smaller of them into merged array.
			while (indexFirst < first.length && indexSecond < second.length) 
			{
				if (first[indexFirst] < second[indexSecond]) 
				{
					merged[indexMerged] = first[indexFirst];
					indexFirst++; 
				} 
				else 
				{
					merged[indexMerged] = second[indexSecond];
					indexSecond++; 
				}
				indexMerged++;
			}
			
			if (indexFirst < first.length) // Copy remaining elements of first into merged.
				System.arraycopy(first, indexFirst, merged, indexMerged, first.length - indexFirst);
			
			if (indexSecond < second.length) // Copy remaining elements of second into merged.
				System.arraycopy(second, indexSecond, merged, indexMerged, second.length - indexSecond);
		}


////////////////////////////////////////////////////////////////////////////////////////////////
		private static void quickSort(int[] data, int min, int max) 
		{
			if (max <= min) return;

			else
			{
				System.out.println(Arrays.toString(data)); // Just for demonstration purposes.
				System.out.println("Partitioning elements between " + min + " and " + max);
				
				int indexOfPartition = findPartition(data, min, max);
				System.out.println("Partition made at Position: " + indexOfPartition + " Element: " + data[indexOfPartition]);
				
				quickSort(data, min, indexOfPartition - 1);
				quickSort(data, indexOfPartition + 1, max);
			}
		}



		private static int findPartition(int[] data, int min, int max) 
		{
		    int temp;
		    int pivot = data[min]; // Pivot is element in position min
		    int left = min;
		    int right = max + 1;
		    
		    while (left < right) 
		    { 
		    	do left++; // Search from left for element that is >= pivot. 
		    	while (left < right && data[left] < pivot);
		    	// Prevent left from crossing right (speeds up algorithm slightly)

		    	do right--; // Search from right for element that is <= pivot.
		    	while (data[right] > pivot);

		    	if (left < right) 
		    	{ // Exchange elements if out of order.
		    		temp = data[left];
		    		data[left] = data[right];
		    		data[right] = temp; 
		    	}
		    } 

	        // Swap pivot with element in position right. 
		    data[min] = data[right]; 
		    data[right] = pivot;
		    
		    return right; // Return the partition point.
		}


///////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args)
    {
        int[] array = {12,9,4,1,99,120,1,3,10,0};
		int[] sort = {90,8,7,56,88,1,25,89,50,15};

		selectionSort(sort);
		System.out.println(sort);
			System.out.print("Values Before the sort: ");
			System.out.println(Arrays.toString(array));
//
			selectionSort(array);
//			// insertionSort(array);
//			// mergeSort(array);
//			// quickSort(array, 0, array.length - 1);
//
//
			System.out.print("Values after the sort: ");
			System.out.println(Arrays.toString(array));


    }
	 

}
