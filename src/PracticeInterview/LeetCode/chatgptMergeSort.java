package PracticeInterview.LeetCode;

import java.util.Arrays;

public class chatgptMergeSort {
    public static void main(String[] args) {
        int[] arr = {7, 3, 8, 4, 1};
        int[] temp = new int[arr.length];
        sortingusingMergeSort(arr, temp, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr)); // Output: [1, 3, 4, 7, 8]
    }

    private static void sortingusingMergeSort(int[] arr, int[] temp, int left, int right) {
        if (left <right) {
            int mid = (left + right) / 2;
            sortingusingMergeSort(arr, temp, left, mid);  // ✅ Fix: Mid should be included
            sortingusingMergeSort(arr, temp, mid + 1, right);  // ✅ Fix: Mid+1 for right half
            mergeArray(arr, temp, left, mid, right);
        }
    }

    private static void mergeArray(int[] arr, int[] temp, int left, int mid, int right) {
        int leftStart = left;
        int rightStart = mid + 1;
        int tempPos = left;

        // Merge two sorted halves
        while (leftStart <= mid && rightStart <= right) {
            if (arr[leftStart] <= arr[rightStart]) {
                temp[tempPos++] = arr[leftStart++];
            } else {
                temp[tempPos++] = arr[rightStart++];
            }
        }

        // Copy remaining elements of left half
        while (leftStart <= mid) {
            temp[tempPos++] = arr[leftStart++];
        }

        // Copy remaining elements of right half
        while (rightStart <= right) {
            temp[tempPos++] = arr[rightStart++];
        }

        // ✅ Fix: Copy sorted elements back to original array
        System.arraycopy(temp, left, arr, left, right-left+1);
    }
}
