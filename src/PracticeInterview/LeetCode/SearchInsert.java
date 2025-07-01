package PracticeInterview.LeetCode;

public class SearchInsert {
    public static void main(String[] args) {
        int[] num = {1,3,5,6};
        int n = num.length;
        int target = 0;
       System.out.println(findBinarySearch(num, n, target));

    }

    public static int findBinarySearch(int[] num, int n, int target) {
        int low = 0;
        int high = n - 1;
        int mid=0;
        while (low <=high) {
             mid = (low+high)/ 2;
            if (num[mid] == target) {
                return mid;
            } else if (num[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        if(target<num[mid])
        {
            return mid-1;
        } else {
            return mid+1;
        }

    }
}
