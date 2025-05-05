package PracticeInterview.ArraysProgram;

import java.util.Arrays;

public class SearchElement {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 3};
        int target = 3;
        int index=findUsingLinearSearch(array,target);
        if(index!=-1)
        {
            System.out.print(" found at position "+index);
        }
        else {
            System.out.print(" not found");
        }
    }

    private static int findUsingLinearSearch(int[] array, int target) {
       for(int i=0;i<=array.length-1;i++)
       {
           if(array[i]==target)
           {
               return i;
           }
       }
        return -1;
    }
}
