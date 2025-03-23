package PracticeInterview.LinkedList;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class LinkedListLoopHashTable_BF {
    static Node headNode;

    //This approach takes O(N) time, where N is the number of nodes in the list.
    //It also requires O(N) extra space for storing nodes in the HashSet.
    public static void main(String[] args) {

        LinkedListLoopHashTable_BF list = new LinkedListLoopHashTable_BF();
        headNode = new Node(1);
        Node n1 = new Node(2);
        headNode.setNext(n1);
        Node n2 = new Node(3);
        n1.setNext(n2);
        Node n3 = new Node(4);
        n2.setNext(n3);
        // n3.setNext(n2); // to form a loop
        list.findLoop();
    }
    public void findLoop() {
        Node temp = headNode;
        Set<Node> set = new HashSet<>() {
        };
        int index = 1;
        while (temp != null) {
            if (set.contains(temp)) {
                System.out.println("loop exists");
                return;
            } else {
                set.add(temp);
                temp = temp.getNext();
            }

        }
        System.out.println(" no loop found");
    }
    /// ******************using HashSet************
//    public void findLoop() {
//        Node temp = headNode;
//        Set<Node> set = new HashSet<>();
//        while (temp != null) {
//            if (set.contains(temp) ){
//                System.out.println("loop exists");
//                return;
//            } else {
//                set.add(temp);
//                temp = temp.getNext();
//            }
//
//        }
//        System.out.println(" no loop found");
//    }
}
