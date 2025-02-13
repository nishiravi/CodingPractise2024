package PracticeInterview.ArraysProgram;

import java.util.Arrays;

public class MergeSortSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {1, 4, 6, 8};
        System.out.println(Arrays.toString(mergeSortVeirfy(arr1, arr2)));
    }

    private static int[] mergeSortVeirfy(int[] arr1, int[] arr2) {
        int[] resultarr = new int[arr1.length+ arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j< arr2.length) {
            if (arr1[i] <arr2[j]) {
                resultarr[k++] = arr1[i++];
            } else {
                resultarr[k++] = arr2[j++];
            }
        }
            while (i < arr1.length) {
                resultarr[k++] = arr1[i++];
            }
            while (j < arr2.length) {
                resultarr[k++] = arr2[j++];
            }

        return resultarr;
        }


    }

