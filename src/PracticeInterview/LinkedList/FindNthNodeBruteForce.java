package PracticeInterview.LinkedList;

public class FindNthNodeBruteForce {
    static Node headNode;
// time complexity=O(n^2), space complexity=O(1)
    public static void main(String[] args) {
        int n = 3;
        FindNthNodeBruteForce list = new FindNthNodeBruteForce();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.findnthNodeData(n);
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = newNode;
            return;
        }
        Node temp = headNode;
        while (temp.next != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }

    public void findnthNodeData(int n) {
        Node temp = headNode;
        // find the length of the list
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.getNext();
        }

        //// Check if n is greater than the size of the list
        if (n <= 0 || n > length) {
            System.out.println("not in range");
            return;
        }

        // traverse to the size-n;
        temp = headNode;
        for (int i = 0; i < length - n; i++) {
            temp = temp.getNext();
        }
        System.out.println( n + "  Node from the end value is" + temp.getData());
    }
}
