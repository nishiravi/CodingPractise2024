package PracticeInterview.LeetCode;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {7, 3, 8, 4, 1};
        int[] temp = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        sortingusingMergeSort(arr, temp, left, right);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortingusingMergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = (right + left) / 2;
            sortingusingMergeSort(arr, temp, left, mid );
            sortingusingMergeSort(arr, temp, mid+1, right);
            mergeArray(arr,temp,left,mid,right);
        }
    }
    
    public static void mergeArray(int[] arr,int[] temp,int left, int mid, int right)
    {
        int temp_pos=left;
        int left_end=mid;
        int right_start = mid+1;
        int start = left;
        int end = right;
        while(left<=left_end && right_start<=right) {
                if(arr[left]<=arr[right_start])
                {
                    temp[temp_pos]=arr[left];
                    temp_pos=temp_pos+1;
                    left=left+1;
                } else {
                    temp[temp_pos]=arr[right_start];
                    temp_pos=temp_pos+1;
                    right_start=right_start+1;
                }
        }
        while(left<=left_end)
        {
            temp[temp_pos]=arr[left];
            temp_pos=temp_pos+1;
            left=left+1;
        }
        while(right_start<=right)
        {
            temp[temp_pos]=arr[right_start];
            temp_pos=temp_pos+1;
            right_start=right_start+1;
        }
        for (int i = start; i <= end; i++) {
            arr[i] = temp[i];
        }

    }


}

