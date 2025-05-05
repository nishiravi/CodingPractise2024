package PracticeInterview.ArraysProgram;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr={5,0,6,9,10};
        for(int i=0;i<=arr.length-1;i++)
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
        System.out.println("smallestElementis "+arr[0]);
        System.out.println("largetsElement "+arr[arr.length-1]);
    }
}
