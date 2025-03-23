package PracticeInterview.LeetCode;

import PracticeInterview.LinkedList.Node;

public class MiddleLinkedList {
    static Node head;
    public static void main(String[] args) {
        MiddleLinkedList list=new MiddleLinkedList();
        head = new Node(1);
        Node n1 = new Node(2);
        head.setNext(n1);
        Node n2 = new Node(3);
        n1.setNext(n2);
//        Node n3 = new Node(4);
//        n2.setNext(n3);
        System.out.println(middleLinkedList(head));
    }
    public static int middleLinkedList(Node head)
    {
        Node fastptr=head;
        Node slowptr=head;
        while(fastptr != null && fastptr.getNext() != null)
        {
            fastptr=fastptr.getNext().getNext();
            slowptr=slowptr.getNext();
        }
        return slowptr.getData();
    }
}
