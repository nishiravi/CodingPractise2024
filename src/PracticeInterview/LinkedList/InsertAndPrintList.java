package PracticeInterview.LinkedList;

public class InsertAndPrintList {
    Node headNode;

    public static void main(String[] args) {
        InsertAndPrintList list = new InsertAndPrintList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.printList();
        System.out.println("insert in the start of the list");
        list.insertAtStart(5);
        list.insertAtStart(6);
        list.printList();
        System.out.println("insert in a particular position  of the list");
        list.insertAtPosition(3, 60);
        list.insertAtPosition(0, 1);
        list.printList();
        list.insertAtPosition(-1, 1);
    }

    public static int listLength(Node headNode) {
        if(headNode == null)
            return 0;
        int length=1;
        Node temp = headNode;
        while (temp.next != null) {
            length++;
            temp = temp.getNext();
        }
        return length;
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = newNode;
            return;
        }
        newNode.next = headNode; // adding next of neNode to point to headNode
        headNode = newNode; // make new Node as HeadNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        //inserting at the beginning
        if (headNode == null) {
            headNode = newNode;
            return;
        }
        //inserting at the end
        Node temp = headNode;
        while (temp.next != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }

    public void insertAtPosition(int position, int data) {
        Node newNode = new Node(data);
        int size = listLength(headNode);
        if (position < 0 || position > size + 1) {
            System.out.println("invaild position");
            return;
        }
        if (position == 0) {
            insertAtStart(data);
            return;
        }
        Node temp = headNode;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.getNext();
        }
        if (temp == null) {
            System.out.println("out of range");
            return;
        }
        newNode.next = temp.next;
        temp.setNext(newNode);
    }

    //print List
    public void printList() {
        Node temp = headNode;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        System.out.println("end of the list");
    }
}
