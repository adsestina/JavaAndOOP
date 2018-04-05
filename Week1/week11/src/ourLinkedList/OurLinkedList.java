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
            while(current.getNode() != null) {
                current = current.getNode();
            }
            current.setNode(newNode);
        }
        size++;

    }


    public void removeNode(int position) {
        if(size != 0) {
            if (position < 0) {
                Node temp = firstNode.getNode();
                firstNode = temp;
            } else {
                // postion greater thatn zero
                if (position >= size){
                    position = size -1;
                }
                Node current = firstNode;
                for (int count = 0; count < position - 1; count++) {
                    current = current.getNode();
                }
                Node nodeToRemove = current.getNode();
                current.setNode(nodeToRemove.getNode());
            }
            size--;
        }


    }

//    public int getDataValue(int position) {
//        Node current = firstNode;
//        int count = 0;
//        while(count < position) {
//            current = current.getNode();
//            count++;
//        }
//        return current.getValue();
//    }

    public int getDataValue(int position) {
        Node current = firstNode;

        for (int count = 0; count < position; count++) {
            current = current.getNode();

        }
        return current.getValue();
    }

    //insert
    public void insert(int position, int value) {
        if (position > size) {
            addNode(value);
        } else if (position <= 0) {
            //create a new node
            Node newNode = new Node(value);
            //set newNode's link to firstNode
            newNode.setNode(firstNode);
            //make first node = new Node
            firstNode = newNode;
        } else {


            Node newNode = new Node(value);
            Node current = firstNode;
            for (int count = 0; count < position-1; count++) {
                current = current.getNode();
            }
            Node temp = current.getNode();
            newNode.setNode(temp);
            current.setNode(newNode);
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
            while(current != null) {
                out = out + current + " ";
                current = current.getNode();
            }
            return out;
        }

        return out;
    }

}
