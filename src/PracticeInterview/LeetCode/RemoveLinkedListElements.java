package PracticeInterview.LeetCode;

import PracticeInterview.LinkedList.Node;

public class RemoveLinkedListElements {
    //https://leetcode.com/problems/remove-linked-list-elements/
    public Node removeElements(Node head, int val) {
        while(head!=null && head.getData() ==val)
        {
            head= head.getNext();
        }
        Node current=head;
        Node previous=null;
        while(current!=null){
            if(current.getData()==val)
            {
                previous.setNext(current.getNext());
            } else
            {
                previous=current;
            }
            current= current.getNext();
        }
        return head;
    }
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
