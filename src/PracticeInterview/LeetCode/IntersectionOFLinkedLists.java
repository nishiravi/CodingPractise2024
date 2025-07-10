package PracticeInterview.LeetCode;

class ListNodetest {
    int val;
    ListNodetest next;

    ListNodetest(int val) {
        this.val = val;
        this.next = null;
    }
}
public class IntersectionOFLinkedLists  {
    public static void main(String[] args) {
        ListNodetest intersection = new ListNodetest(8);
        intersection.next = new ListNodetest(10);
        ListNodetest headA=new ListNodetest(1);
        headA.next=new ListNodetest(2);
        headA.next.next=intersection;
        ListNodetest headB=new ListNodetest(3);
        headB.next=new ListNodetest(4);
        headB.next.next=intersection;
        ListNodetest result=getIntersectionNode( headA,  headB);
        if (result != null)
            System.out.println("Intersection at node with value: " + result.val);
        else
            System.out.println("No intersection found.");
    }

    private static ListNodetest getIntersectionNode(ListNodetest headA, ListNodetest headB) {
        if(headA==null || headB==null) return null;
      for(ListNodetest a=headA;a!=null;a=a.next)
      {
          for(ListNodetest b=headB;b!=null;b=b.next)
          {
              if(a==b)
              {
                  return a;
              }
          }
      }
      return null;
    }
    // OPTIMIZED SOLUTION
//    public ListNodetest getIntersectionNode(ListNodetest headA, ListNodetest headB) {
//        if (headA == null || headB == null) return null;
//
//        ListNodetest a = headA;
//        ListNodetest b = headB;
//
//        while (a != b) {
//            a = (a == null) ? headB : a.next;
//            b = (b == null) ? headA : b.next;
//        }
//
//        return a;
//    }
}
