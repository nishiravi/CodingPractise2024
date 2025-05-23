package PracticeInterview.LeetCode;

import PracticeInterview.LinkedList.Node;

import java.util.Hashtable;
import java.util.Map;

public class LinkedListLoopBF {
    static Node headNode;

    //This approach takes O(N) time, where N is the number of nodes in the list.
    //It also requires O(N) extra space for storing nodes in the HashSet.

    public static void main(String[] args) {

        LinkedListLoopBF list = new LinkedListLoopBF();
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
        Map<Node, Boolean> map = new Hashtable<>();
        int index = 1;
        while (temp != null) {
            if (map.containsKey(temp)) {
                System.out.println("loop exists");
                return;
            } else {
                map.put(temp, true);
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
