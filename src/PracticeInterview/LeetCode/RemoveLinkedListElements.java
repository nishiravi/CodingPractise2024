package PracticeInterview.LeetCode;

public class RemoveLinkedListElements {
}


//public static Node removeElements(Node head, int val) {
//    // Check if the head node needs to be removed
//    while (head != null && head.getData() == val) {
//        head = head.getNext(); // Move the head to the next node
//    }
//
//    // Initialize the previous and current pointers
//    Node current = head;
//    Node previous = null;
//    // Traverse the list
//    while (current != null) {
//        if (current.getData() == val) {
//            // Remove the current node by linking previous to current's next
//            previous.setNext(current.getNext());
//        } else {
//            // Move previous and current forward
//            previous = current;
//        }
//        current = current.getNext();
//    }
//    return head;
//}
