package PracticeInterview.LinkedList;

public class FindMiddleElement {
    static Node headNode;

    public static void main(String[] args) {
        FindMiddleElement list = new FindMiddleElement();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        System.out.println(middleElement(headNode));
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

    public static int middleElement(Node headNode) {
        Node firstNode = headNode;
        Node secondNode = headNode;
        int i = 0;
        while (firstNode.getNext() != null) {
            if (i == 0) {
                firstNode = firstNode.getNext();
                i = 1;
            } else if (i == 1) {
                firstNode = firstNode.getNext();
                secondNode = secondNode.getNext();
                i = 0;
            }
        }
        return secondNode.getData();
    }
}
