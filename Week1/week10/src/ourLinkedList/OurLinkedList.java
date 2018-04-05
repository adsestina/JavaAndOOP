package ourLinkedList;



public class OurLinkedList {

    //instance variables
    private Node firstNode;
    private int size;

    //Constructor
    public OurLinkedList() {
        firstNode = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    //addNode
    public void addNode(int value) {
        Node newNode = new Node(value);
        if (firstNode == null) {
            firstNode = newNode;
        } else {
            Node current = firstNode;
            while (current.getNode() != null) {
                current = current.getNode();

            }
            current.setNode(newNode);
        }
        size++;
    }

    public int getValue(int position) {
        Node current = firstNode;
        int count = 0;
        while (count < position) {
            current = current.getNode();
            count++;
        }
        return current.getValue();
    }

    //insert
    public void insert(int position, int value) {
        Node current = firstNode;
        if (position > size) {
            addNode(value);
        } else if(position <= 0) {
            Node newNode = new Node(value);
            newNode.setNode(firstNode);
            firstNode = newNode;
        }else{
            Node newNode = new Node(value);
            int count = 0;
            while(count < position - 1) {
                current = current.getNode();
                Node temp = current.getNode();
                newNode.setNode(temp);
                current.setNode(newNode);

            }

        }


    }

    //Remove
    public void remove(int position) {

    }

    //toString
    public String toString() {
        String out = "";
        if (firstNode == null) {
            out = "Empty List";
    } else {
            Node current = firstNode;
            while (current != null) {
                out = out + current + " ";
                current = current.getNode();

            }
        }

        return out;
    }

}
