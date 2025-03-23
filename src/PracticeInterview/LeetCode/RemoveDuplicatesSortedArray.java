package PracticeInterview.LeetCode;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    //Given an integer array nums sorted in non-decreasing order,
    // remove the duplicates in-place such that each unique element appears only once.
    // The relative order of the elements should be kept the same.
    // Then return the number of unique elements in nums.
    //Consider the number of unique elements of nums to be k, to get accepted,
    // you need to do the following things:
    //Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
    // The remaining elements of nums are not important as well as the size of nums.
    //Return k.
    public static void main(String[] args) {

        int[] num={0,0,1,1,1,2,2,3,3,4};

       int i=0,j=1;
       while(j<=num.length-1)
       {
           if(num[i]!=num[j]){
               i++;
               num[i]=num[j];
           }
           j++;
       }
       System.out.println(i);
           System.out.println(Arrays.toString(num));
    }
}
