package PracticeInterview.LinkedList;

import PracticeInterview.LinkedList.Node;

public class FloydCycleDetection {
   static Node head;
    public static void main(String[] args) {
        FloydCycleDetection list = new FloydCycleDetection();
        head = new Node(1);
        Node n1 = new Node(2);
        head.setNext(n1);
        Node n2 = new Node(3);
        n1.setNext(n2);
        Node n3 = new Node(4);
        n2.setNext(n3);
        n3.setNext(n2); // loop

        list.detectLoop(); // Checking for a loop
    }
    // Function to detect a loop using Floyd’s Cycle Detection Algorithm
    public boolean detectLoop() {
        Node slow = head; // Slow pointer (🐢)
        Node fast = head; // Fast pointer (🐇)

        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow pointer by 1 step
            fast = fast.next.next;  // Move fast pointer by 2 steps

            if (slow == fast) {  // If they meet, loop is detected
                System.out.println("Loop detected!");
                return true;
            }
        }
        System.out.println("No loop found.");
        return false;
    }

    // Function to create a loop for testing
//    public void createLoop() {
//        Node temp = head;
//        Node loopNode = null;
//        int count = 1;
//
//        while (temp.next != null) {
//            if (count == 3) {  // Create a loop at node 3
//                loopNode = temp;
//            }
//            temp = temp.next;
//            count++;
//        }
//        temp.next = loopNode; // Last node points to node 3 (loop)
//    }


}
