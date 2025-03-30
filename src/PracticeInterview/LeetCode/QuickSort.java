package PracticeInterview.LeetCode;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 5, 9, 2, 8};
        int low = 0;
       int  high =arr.length-1;
       quicksorting(arr,low,high);
       System.out.println(Arrays.toString(arr));
    }

    public static void quicksorting(int[] arr, int low, int high) {
        if(low<high)
        {
            int pivotIndex=partion(arr,low,high);
            quicksorting(arr,low,pivotIndex-1);
            quicksorting(arr,pivotIndex+1,high);
        }
    }

    public static int partion(int[] arr, int low, int high) {
        int pivotElement=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]< pivotElement)
            {
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
}
