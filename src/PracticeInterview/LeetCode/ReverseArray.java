package PracticeInterview.LeetCode;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5};
        reverse(arr);

    }

    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < arr.length - 1 && j >= 0) {
            if (i > j) {
                System.out.println(Arrays.toString(arr));
                return;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

}
