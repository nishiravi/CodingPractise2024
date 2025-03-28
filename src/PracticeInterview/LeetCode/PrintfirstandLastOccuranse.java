package PracticeInterview.LeetCode;

import java.util.ArrayList;
import java.util.Map;

public class PrintfirstandLastOccuranse {
    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 4, 5, 5, 5, 8};
        int low = 0;
        int high = arr.length - 1;
        int target=1;
        System.out.println("first occurance of "+target+"is"+firstoccurance(arr, low, high,target));
        System.out.println("last occurance of "+target+"is"+lastOccurance(arr, low, high,target));
    }

    private static int lastOccurance(int[] arr, int low, int high,int target) {

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                if(mid==arr.length-1 || arr[mid+1]!=arr[mid])
                {
                    return mid;
                } else
                    low=mid+1;
            }
            else if(arr[mid]<target) {
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return -1;
    }


    public static int firstoccurance(int[] arr, int low, int high,int target) {

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                if(mid==0 || arr[mid-1]!=arr[mid])
                {
                    return mid;
                } else
                    high=mid-1;
            }
            else if(arr[mid]<target) {
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return -1;
    }
}




