package PracticeInterview.LeetCode;

import java.util.ArrayList;

public class MergeSortedArray {
    //You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
    // and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
    //Merge nums1 and nums2 into a single array sorted in non-decreasing order.
    //The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
    // To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
    // and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
    public static void main(String[] args) {

        int[] num1 = {2, 5, 6, 8};
        int[] num2 = {1, 5, 8, 9};
        ArrayList<Integer> mergedArray = new ArrayList<>();
      int i=0,j=0;
        while(i<=num1.length-1 && j<=num2.length-1){
                if (num1[i] <= num2[j]) {
                    mergedArray.add(num1[i]);
                    i++;
                } else {
                    mergedArray.add(num2[j]);
                    j++;
                }
            }
        while(i<=num1.length-1){

            mergedArray.add(num1[i]);
            i++;
        }
        while(j<=num2.length-1) {

            mergedArray.add(num2[j]);
            j++;
        }
        System.out.println(mergedArray);
    }
}
