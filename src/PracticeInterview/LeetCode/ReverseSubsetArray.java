package PracticeInterview.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseSubsetArray {
    public static void main(String[] args) {
        //https://www.geeksforgeeks.org/reverse-an-array-in-groups-of-given-size/
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        if (k > arr.length) {  // reverse the full array
            reverseArray(arr, 0, arr.length - 1);
        } else {
            // reverse the subarray
            for (int i = 0; i <= arr.length; i += k) {
                int left = i;
                int right = Math.min(i + k - 1, arr.length - 1);// Ensure we don't go out of bound
                reverseArray(arr, left, right);
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
