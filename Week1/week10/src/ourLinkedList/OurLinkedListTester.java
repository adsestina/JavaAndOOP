package ourLinkedList;

public class OurLinkedListTester {

	public static void main(String[] args) {
			//try creating and testing a node
//        Node node1 = new Node(0);
//        System.out.println(node1);
//
//        Node node2 = new Node(1);
//        node1.setNode(node2);
//		System.out.println();
//        Node node3 = new Node(2);
//        node2.setNode(node3);
////
//         boolean done = false;
//         Node pointerNode = node1;
//         while (!done) {
//             System.out.print(pointerNode + " ");
//             if (pointerNode.getNode() == null)
//                 done = true;
//             else {
//                 pointerNode = pointerNode.getNode();
//             }
//         }
//        System.out.println();

//        // create and test a linked list
        OurLinkedList list = new OurLinkedList();
        System.out.println("list is " + list);
        System.out.println("Something");
//        //list.insert(10,50);
//        //System.out.println(list);
        list.addNode(4);
        System.out.println(list); // 4
        System.out.println("0th item: "+ list.getValue(0));
        list.addNode(2);
        System.out.println(list); // 4 2
        list.addNode(7);
        list.addNode(71);
        list.addNode(6);
        System.out.println(list); // 4 2 7 71 6
//
//        System.out.println(list.size());
//        list.insert(3, 10);
//
//        System.out.println(list); // 4 2 7 10 71 6
//        list.insert(1, 100);
//
//        System.out.println(list); // 4 100 2 7 10 71 6
//        list.insert(0, 5);
//
//        System.out.println(list); // 5 4 100 2 7 10 71 6
//        list.insert(-2, -2);
//
//        System.out.println(list); // -2 5 4 100 2 7 10 71 6
//
//        list.insert(500, -4);
//
//        System.out.println(list); // -2 5 4 100 2 7 10 71 6 -4
//        list.addNode(1000);
//        System.out.println(list); // -2 5 4 100 2 7 10 71 6 -4 1000
//        list.remove(3);
//        System.out.println(list); // -2 5 4 2 7 10 71 6 -4 1000
//
//        list.remove(-3);
//        System.out.println(list); // 5 4 2 7 10 71 6 -4 1000
//        list.remove(100);
//        System.out.println(list); // 5 4 2 7 10 71 6 -4
//        int deleteCount = list.size() + 1;  //Note this goes one beyond the end of the list
//        for (int count = 0; count < deleteCount; count++) {
//            list.remove(0);
//            System.out.println(list);
//        }



	}

}