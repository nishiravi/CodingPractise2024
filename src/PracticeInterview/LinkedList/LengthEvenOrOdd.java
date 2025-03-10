package PracticeInterview.LinkedList;

public class LengthEvenOrOdd {
    // check if list length even or odd
    static Node headNode;

    public static void main(String[] args) {
        LengthEvenOrOdd list = new LengthEvenOrOdd();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        evenOrOdd(headNode);
    }

    public static void insert(int data) {
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = newNode;
            return;
        }
        Node temp = headNode;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }

    public static void evenOrOdd(Node headNode) {

        while (headNode != null && headNode.getNext() != null) {
            headNode = headNode.getNext().getNext();
        }
        if (headNode == null) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
