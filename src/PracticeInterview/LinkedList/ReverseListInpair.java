package PracticeInterview.LinkedList;

public class ReverseListInpair {
    // reverse the linked list in pairs
    //Ex: 1->2->3->4
    //op: 2->1->
    static Node headNode;

    public static void main(String[] args) {
        reverInpair(headNode);
    }

    //recursion
    private static void reverInpair(Node headNode) {

        if (headNode == null & headNode.getNext() == null) {
            return;
        }
        Node temp = headNode.getNext();
        headNode.setNext(temp.getNext());
        temp.setNext(headNode);
        reverInpair(headNode.getNext());
    }

    //iteration
    public static void reverseIteration(Node headNode) {
        Node current = headNode;
        while (current != null && current.getNext() != null) {
            Node temp = current.getNext();
            Node temp2 = temp.getNext();
            current.setNext(temp2);
            temp.setNext(current);
            if (current==headNode)
                current = current.getNext();
        }
    }
}
