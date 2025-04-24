package PracticeInterview.ArraysProgram;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromsortedArray {
    public static void main(String[] args) {
        int[] arr={0,1,1,2,2,3};
       int k=0,j=1;
       while(j<arr.length)
       {
           if(arr[k]!=arr[j])
           {
               k++;
               arr[k]=arr[j];
           }
           j++;
       }
        System.out.print(Arrays.toString(arr));
    }

}
