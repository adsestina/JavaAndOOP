package ourLinkedList;

/**
 * Created by Owner on 3/19/2017.
 */

public class Node {

    //instance variables
    private int intValue;
    private Node link;

    //constructor
    public Node(int value) {
        intValue = value;
        link = null;
    }

    public void setNode(Node newNode) {
        link = newNode;
    }


    public int getValue() {

        return intValue;
    }
    //return the node
    public Node getNode() {

        return link;
    }

    //toString
    public String toString() {

        return "" + intValue;
    }

}
