package queues;
import java.util.Arrays;

public class CircularQueue {
	
	private static final int CAPACITY = 10;
	private int head;
	private int tail;
	private String[] theQueue;
	private int count = 0;
	
	public CircularQueue()
	{
		head = 0;  //spot to be removed next
		tail = 0;  //first empty spot
		count = 0;
		theQueue = new String[CAPACITY];
	}
	
	public void enqueue(String item) 
	{
		if (count < CAPACITY)
		{
			theQueue[tail] = item;
			if (tail < theQueue.length-1)
				tail++;
			else
				//at end of array go to beginning
				tail = 0;
			count++;
			
		} else 
			System.out.println("Queue is full");  //could increase its capicity here
	}
	

	public String dequeue() 
	{
		String out = theQueue[head];
		if (head < theQueue.length-1)
			head++;
		else
			head = 0;
		
		count--;
		return out;
	}
	
	
	public String peek()
	{
		return theQueue[head];
	}
	
	public String toString()
	{
		String out = "";
		for (int i = 0; i < count; i++)
			out = out + theQueue[head + i] + " ";
		return out;
	}
}
