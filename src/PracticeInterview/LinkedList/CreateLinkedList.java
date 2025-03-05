package PracticeInterview.LinkedList;

public class CreateLinkedList {
    Node headNode; // // Head node to track the first node

    public static void main(String[] args) {
        CreateLinkedList list = new CreateLinkedList();
        // call method to insert an item in the list, assuming at the end
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        // Print the linked list
        System.out.println("Linked List:");
        list.printList();
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data); //create a new Node
        // If list is empty, set head to new node add in the beginning
        if (headNode == null) {
            headNode = newNode;
            return;
        }
        // to add the new node at the end
        // step 1 traverse till the end of the list , once reached end add the new node
        Node temp = headNode;
        while (temp.next != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);// Link last node to new node
    }

    //print the elements in the list
    public void printList() {
        Node temp = headNode;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        System.out.println("End of the list");
    }
}
