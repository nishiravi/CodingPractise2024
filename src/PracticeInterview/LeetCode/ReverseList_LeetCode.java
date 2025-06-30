package PracticeInterview.LeetCode;

public class ReverseList_LeetCode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode reverseList(ListNode head) {
            if (head == null) {
                return head;
            } else {
                ListNode temp = null, nextNode = null;
                while (head != null) {
                    nextNode = head.next;
                    head.next = temp;
                    temp = head;
                    head = nextNode;

                }
                return temp;
            }

        }
    }
}
