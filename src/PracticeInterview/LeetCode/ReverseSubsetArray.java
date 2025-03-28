package PracticeInterview.LeetCode;

import java.util.Arrays;

public class ReverseSubsetArray {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11,15,17,19};
        int n=4;
        for (int i = 0; i < arr.length; i += n) {
            int left = i;
            int right = Math.min(i + n - 1, arr.length - 1); // Ensure we don't go out of bound
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Reversed array in subsets of " + n + ": " + Arrays.toString(arr));
    }
}
