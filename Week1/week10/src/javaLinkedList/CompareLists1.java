package javaLinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class CompareLists1 {
	
	//compare time for adding to lists

	public static void main(String[] args) {
		int length = 100000;
		List<String> llList = new LinkedList<String>(); 
		llList.add("Dopey");
		for (int i = 0; i < length; i++)
			llList.add(0,"Bashful");
		System.out.println("LinkedListDone");
		            
		List<String> alList = new ArrayList<String>(length); 
		alList.add("Dopey");
		for (int i = 0; i < length; i++) alList.add(0,"Bashful");
		System.out.println("ArrayListDone");
		
		
		for (int i = 0; i < length; i++)
		    llList.get((int)(length * Math.random())); 
		System.out.println("LinkedListDoneAccessing");
		            
		for (int i = 0; i < length; i++)
		    alList.get((int)(length * Math.random())); 
		System.out.println("ArrayListDoneAccessing");


	}

}
