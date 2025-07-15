package PracticeInterview.LeetCode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num = {1,3,5,6};
        int n = num.length;
        int target = 5;
       System.out.println(findBinarySearch(num, n, target));

    }

    public static int findBinarySearch(int[] num, int n, int target) {
        int low = 0;
        int high = n - 1;
        int mid=0;
        while (low <=high) {
             mid = low +(high-low)/ 2;
            if (num[mid] == target) {
                return mid;
            } else if (num[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
