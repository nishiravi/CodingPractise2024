class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class FloydCycleDetection {
    Node head;

    // Function to detect a loop using Floyd’s Cycle Detection Algorithm
    public boolean detectLoop() {
        Node slow = head; // Slow pointer (🐢)
        Node fast = head; // Fast pointer (🐇)

        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow pointer by 1 step
            fast = fast.next.next;  // Move fast pointer by 2 steps

            if (slow == fast) {  // If they meet, loop is detected
                System.out.println("Loop detected!");
                return true;
            }
        }
        System.out.println("No loop found.");
        return false;
    }

    // Function to create a loop for testing
    public void createLoop() {
        Node temp = head;
        Node loopNode = null;
        int count = 1;

        while (temp.next != null) {
            if (count == 3) {  // Create a loop at node 3
                loopNode = temp;
            }
            temp = temp.next;
            count++;
        }
        temp.next = loopNode; // Last node points to node 3 (loop)
    }

    public static void main(String[] args) {
        FloydCycleDetection list = new FloydCycleDetection();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
        list.head.next.next.next.next.next.next.next = new Node(8);

        list.createLoop(); // Creating a loop at node 3
        list.detectLoop(); // Checking for a loop
    }
}
