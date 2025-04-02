package PracticeInterview.LeetCode;

public class QueueDemo {

    public static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            this.arr = new int[n];
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isfull() {
            return (rear + 1) % size == front;
        }

        //enqueu
        public static void add(int data) {
            if (isfull()) {
                System.out.println("queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int result = arr[front];
            //single ement in queue;
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

    }
}
