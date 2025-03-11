package PracticeInterview.LinkedList;

public class ListPalindrome {
    // check if the list is palindrome


    public static void main(String[] args) {
        Node head = new Node(1);
        head.setNext(new Node(2));
        head.getNext().setNext(new Node(2));
        head.getNext().getNext().setNext(new Node(1));
        System.out.println("ispalindrome  " + isplaindrome(head));
    }

    public static boolean isplaindrome(Node head) {
        if (head == null && head.getNext() == null) {
            System.out.println("invalid List");
            return true;
        }
        Node fastPtr = head;
        Node slowPtr = head;
        while (fastPtr != null && fastPtr.getNext() != null) {
            slowPtr = slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
        }
        Node secondhalf = reverse(slowPtr);
        Node firstHslf = head;
        // Compare first half with second half
        Node temp = secondhalf;
        while (temp != null) {
            if (firstHslf.getData() != temp.getData()) {
                System.out.println(" not a palindrome");
                return false;
            }
            firstHslf = firstHslf.getNext();
            temp = temp.getNext();
        }
        //restore the list
        reverse(secondhalf);
        return  true;
    }

    public static Node reverse(Node head) {
        Node temp = null;
        Node current = head;
        Node nextNode;
        while (current!= null) {
            nextNode = current.getNext();
            current.setNext(temp);
            temp = current;
            current = nextNode;
        }
        return temp; // new head of reverse list
    }
}
