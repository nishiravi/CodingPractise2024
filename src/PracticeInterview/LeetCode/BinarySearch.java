package PracticeInterview.LeetCode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};
        int n = num.length;
        int data = 4;
        System.out.println("found in index  " + findBinarySearch(num, n, data));
    }

    public static int findBinarySearch(int[] num, int n, int data) {
        int low = 0;
        int high = n - 1;
        while (low <=high) {
            int mid = (low+high)/ 2;
            if (num[mid] == data) {
                return mid;
            } else if (num[mid] < data)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
