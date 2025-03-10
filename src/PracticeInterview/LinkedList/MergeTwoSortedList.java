package PracticeInterview.LinkedList;

public class MergeTwoSortedList {
    // merge to sorted array
    Node headNode;
    public static void main(String[] args) {


        //mergeList(Node a ,Node b);
    }
    public static Node mergeList(Node a ,Node b)
    {
        Node result=null;
        if(a==null) return b;
        if(b==null) return a;
        if(a.getData()<=b.getData())
        {
            result=a;
            result.setNext(mergeList(a.getNext(),b));
        }
        else {
            result=b;
            result.setNext(mergeList(a,b.getNext()));
        }
        return result;
    }
}
