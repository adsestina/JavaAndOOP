package stacks;
import java.util.Stack;

public class JavaStackExample {

	public static void main(String[] args) {
		Stack<String> temp = new Stack<>();
	    temp.push("how");
	    temp.push("are");
	    String x = temp.pop();
	    temp.push("you");
	    temp.push("now");
	    String y = temp.peek();
	    temp.push("one");
	    String z = temp.pop();
	    System.out.println(temp);


	}

}
