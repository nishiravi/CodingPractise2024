package PracticeInterview.LinkedList;

public class FindNthNodePointers {

    Node headnode;
    // time complexity=O(n), space complexity=O(1)
    public static void main(String[] args) {
        FindNthNodePointers list = new FindNthNodePointers();
        int n = 2;
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.findnthNodeData(n);
    }
    public void insert(int data) {
        Node newnode = new Node(data);
        if (headnode == null) {
            headnode = newnode;
            return;
        }
        Node temp = headnode;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newnode);
    }

    public void findnthNodeData(int n) {
        Node ptemp = headnode;
        Node pnthnode = headnode;
        int i = 1;
        if (n <= 0 || n > lengthList(ptemp)) {
            System.out.println("invalid range");
            return;
        }
        // ptemp reaches n moves
        while (i <n && ptemp != null) {
            ptemp = ptemp.getNext();
            i++;
        }
        // both  pointer moves by 1
        while (ptemp.getNext() != null) {
            ptemp = ptemp.getNext();
            pnthnode = pnthnode.getNext();
        }
        System.out.println(pnthnode.getData());
    }

    public int lengthList(Node headnode) {
        Node temp = headnode;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.getNext();
        }

        return length;
    }
}

