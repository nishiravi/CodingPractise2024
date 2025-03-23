package PracticeInterview.LeetCode;

public class LinkedListCycle {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false; // If the list is empty, no cycle
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer by 1 step
            fast = fast.next.next; // Move fast pointer by 2 steps

            // If slow and fast pointers meet, there is a cycle
            if (slow == fast) {
                return true;
            }
        }

        return false; // If fast pointer reaches null, there is no cycle
    }

    public static void main(String[] args) {
        LinkedListCycle listCycle = new LinkedListCycle();

        // Create linked list nodes
        ListNode head = listCycle.new ListNode(1);
        ListNode n1 = listCycle.new ListNode(2);
        ListNode n2 = listCycle.new ListNode(3);
        ListNode n3 = listCycle.new ListNode(4);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        //n3.next = n2; // Creating a cycle (n3 points back to n1)

        // Check if the list has a cycle
        boolean result = listCycle.hasCycle(head);
        System.out.println(result); // Output: true
    }
}
