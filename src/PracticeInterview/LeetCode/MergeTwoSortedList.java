package PracticeInterview.LeetCode;

import PracticeInterview.LinkedList.Node;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedList {

    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node temp1 = new Node(1);
        temp1.next=new Node(3);
        temp1.next.next=new Node(4);

        Node temp2 = new Node(2);
        temp2.next = new Node(5);
        temp2.next.next = new Node(6);

        mergeList(temp1,temp2);
    }
    public static void mergeList(Node temp1,Node temp2)
    {
        List<Node> list= new ArrayList<>();
        while(temp1!=null && temp2!=null)
        {
            if(temp1.data<=temp2.data)
            {
                list.add(temp1);
                 temp1=temp1.next;
            }
            else {
                list.add(temp2);
               temp2=temp2.next;
            }
        }

        while(temp1!=null)
        {
            list.add(temp1);
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            list.add(temp2);
            temp2=temp2.next;
        }
        List<Integer> result = new ArrayList<>();
        for (Node node : list) {
            result.add(node.data);
        }
        System.out.println(result);
  }
}
