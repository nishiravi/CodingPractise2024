package PracticeInterview.LeetCode;

public class GuessNumber {
    //https://leetcode.com/problems/guess-number-higher-or-lower/description/
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};
        int n = num.length;
       // int data = 1;
       // System.out.println("found in index  " + findBinarySearch(num, n, data));
    }
}
//    public static int findBinarySearch(int[] num, int n, int data) {
//        int low = 0;
//        int high = n - 1;
//        while (low <=high) {
//            int mid = low+(high - low) / 2;
//           // int guess=guess(num[mid);
//            if(guess==0)  {
//                return mid;
//            } else if (guess==1)
//                low = mid + 1;
//            else
//                high = mid - 1;
//        }
//        return -1;
//    }
//}
