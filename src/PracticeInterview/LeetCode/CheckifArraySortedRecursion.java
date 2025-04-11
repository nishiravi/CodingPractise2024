package PracticeInterview.LeetCode;

public class CheckifArraySortedRecursion {
    public static void main(String[] args) {
        int[] arr = {};
        int n=arr.length-1;
        System.out.println(sortedRecursion(arr, n));
    }


    public static boolean sortedRecursion(int[] arr, int n) {
        if(n<=0)
        {
            return true;
        }
        else
        {
            if(arr[n]<arr[n-1])
            {
                return false;
            }
               return  sortedRecursion(arr,n-1);
            }
        }
    }

