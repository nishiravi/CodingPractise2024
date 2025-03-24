package PracticeInterview.LeetCode;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 3, 8, 4, 1};
        sortingusingInsertionSort(arr);
    }

    private static void sortingusingInsertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while ( j >= 0 && temp < arr[j] ){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

