package PracticeInterview.LinkedList;

public class DisplayListFromEnd {
    // find middle element in the list
    static Node headNode;

    public static void main(String[] args) {
        DisplayListFromEnd list = new DisplayListFromEnd();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        listOfElement(headNode);
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode=newNode;
            return ;
        }
        Node temp = headNode;
        while (temp.next != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);

    }

    public static void listOfElement(Node headNode) {

        if(headNode==null)
        {
            return;
        }
        listOfElement(headNode.getNext());
        System.out.println(headNode.getData());

    }
}
