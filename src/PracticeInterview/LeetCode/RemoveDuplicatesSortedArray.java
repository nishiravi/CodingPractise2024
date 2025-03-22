package PracticeInterview.LeetCode;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {

        int[] num={1,1,2,3,3,3,4,8,8};

       int i=0,j=1;
       while(j<=num.length-1)
       {
           if(num[i]!=num[j]){
               i++;
               num[i]=num[j];
           }
           j++;
       }
           System.out.println(Arrays.toString(num));
    }
}
