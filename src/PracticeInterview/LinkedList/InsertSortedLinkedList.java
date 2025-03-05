package PracticeInterview.LinkedList;

public class InsertSortedLinkedList {
   static Node headnode;
    public static void main(String[] args) {
        int n = 3;
        InsertSortedLinkedList list = new InsertSortedLinkedList();
//        list.insert(10);
//        list.insert(20);
//        list.insert(30);
//        list.insert(40);
    }
    public Node inserSortedList(int n)
    {

        Node newNode=new Node (6);
        Node current =headnode;
        Node temp=null;
        if(headnode==null)
        {
            return newNode;
        }
        while(current!=null && current.getData()< newNode.getData())
        {
            temp=current;
            current=current.getNext();
        }
        newNode.setNext(current);
        temp.setNext(newNode);
        return headnode;
    }
}
