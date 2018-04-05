package javaLinkedList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Arrays;

public class TryJavaLinkedLists {

	public static void main(String[] args) {

		Integer[] input = {1,2,3};

		ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(input));
		aList.add(4);
		
		System.out.println(aList);
		System.out.println("Size of list: " + aList.size());
		System.out.println("Does list contain 2? " + aList.contains(2));
		
		
		LinkedList<Integer> lList = new LinkedList<>(Arrays.asList(input));
//
        System.out.println(lList);
        System.out.println("Size of list: " + lList.size());
        System.out.println("Does list contain 2? " + lList.contains(2));
//
//
//
//        //looping through list
//		//for loop
		for (int index = 0; index < lList.size(); index++)
            System.out.print(lList.get(index) + " ");
        System.out.println();
//        //for each loop
        for (Integer number: lList)
            System.out.print(number + " ");
        System.out.println();
//        //iterator
		ListIterator<Integer> iter = lList.listIterator();
		while (iter.hasNext()) {
            System.out.print(iter.next() + " ");

        }
        System.out.println();
        System.out.println("test" + lList);
//

    }

}
