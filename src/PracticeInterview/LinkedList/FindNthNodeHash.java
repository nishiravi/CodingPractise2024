package PracticeInterview.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class FindNthNodeHash {
    Node headNode;
    // time complexity=O(n), space complexity=O(n)
    public static void main(String[] args) {
        int n = 4;
        FindNthNodeHash list = new FindNthNodeHash();
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
        while (temp .getNext()!= null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }

    public void findnthNodeData(int n) {
        Node temp = headNode;
        // add items into the hash table
        Map<Integer, Node> map = new HashMap<>();
        int index = 0;
        while (temp!= null) {
            map.put(index, temp);
            index++;
            temp=temp.getNext();
        }
        int length=index; // length is given by the index value ;
        if(n<=0 |n>length)
        {
            System.out.println("invalid range");
            return;
        }
        // lookup in hashtable for length-n;
        Node nthNode = map.get(length - n);
        System.out.println(nthNode.getData());

    }
}


