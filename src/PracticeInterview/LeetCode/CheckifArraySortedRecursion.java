package PracticeInterview.LeetCode;

public class CheckifArraySortedRecursion {
    public static void main(String[] args) {
        int[] arr = {108, 100, 101, 105};
        int n=arr.length-1;
        System.out.println(sorted(arr, n));
    }

    private static boolean sorted(int[] arr, int n) {
        if(n==0 || n==1)
        {
            return true;
        }
       if (arr[n] <arr[n- 1] ) {
            return false;

        } else {
          sorted(arr,n-1);
        }

        return true;
    }
}
