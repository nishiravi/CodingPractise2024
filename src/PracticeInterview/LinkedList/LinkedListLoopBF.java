package PracticeInterview.LinkedList;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class LinkedListLoopBF {
    static Node headNode;

   // Time Complexity: O(N²) (each node is compared with all other nodes).
   // Space Complexity: O(1) (no extra space used).
    public static void main(String[] args) {

        LinkedListLoopBF list = new LinkedListLoopBF();
        headNode = new Node(1);
        Node n1 = new Node(2);
        headNode.setNext(n1);
        Node n2 = new Node(3);
        n1.setNext(n2);
        Node n3 = new Node(4);
        n2.setNext(n3);
        n3.setNext(n2);
        list.findLoop();
    }

    public void findLoop() {
        Node current = headNode;
        // traverse the list
        while (current != null) {
            // temp pints the next node of current
            Node temp = current.getNext();
            // keep traversing the temp and check if temp=current node ,
            // if not then move temp node one step ahead
            while (temp != null) {
                if (temp == current) {
                    System.out.println(" loop found");
                    return;
                }
                temp = temp.getNext();
            }
                current = current.getNext();
            }
        System.out.println(" no loop found");
        }
    }

