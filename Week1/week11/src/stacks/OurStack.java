package stacks;
import java.util.Arrays;

public class OurStack {
	private static final int DEFAULT_CAPACITY = 10;
	private String[] elements;
	private int size;
	
	public OurStack()
	{
		elements = new String[DEFAULT_CAPACITY];
		size = 0;
	}
	
	public void push(String item)
	{
		if (size == elements.length)
			increaseCapacity();
		elements[size] = item;
		size++;
	}
	
	public String pop()
	{
		String last = elements[size-1];
		size--;
		return last;
	}

	public String peek()
	{

		return elements[size-1];
	}

	private void increaseCapacity()
	{
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}
	
	public String toString()
	{
		String out = "";
		for (int count = 0; count < size; count++)
	          out = out + elements[count] + " ";
		return out;
	}
}
