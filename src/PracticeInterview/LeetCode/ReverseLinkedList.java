package PracticeInterview.LeetCode;

import PracticeInterview.LinkedList.Node;

public class ReverseLinkedList {
   static Node headnode;
    public static void main(String[] args) {
        int n = 3;
        ReverseLinkedList list = new ReverseLinkedList();
//        list.insert(10);
//        list.insert(20);
//        list.insert(30);
//        list.insert(40);
    }
    public Node ReverseList()
    {
     Node temp=null,nextNode=null;
     while(headnode!=null)
     {
         nextNode=headnode.getNext();
         headnode.setNext(temp);
         temp=headnode;
         headnode=nextNode;
     }
  return temp;
    }
}
