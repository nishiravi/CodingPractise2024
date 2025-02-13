package PracticeInterview.ArraysProgram;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[]arr={8,2,1,7,9};
        System.out.println((bubbleSortTest(arr)));
    }

    private static String bubbleSortTest(int[] arr) {

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return Arrays.toString(arr);
    }
}
