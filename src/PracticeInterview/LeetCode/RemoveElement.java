package PracticeInterview.LeetCode;

import java.util.Arrays;

public class RemoveElement {
    //https://leetcode.com/problems/remove-element/description/

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int k = removeElement(nums, val);
        System.out.print(k);
    }

    private static int removeElement(int[] nums, int val) {
        int j = 0, k = -1;
        while (j <nums.length ) {
            if (nums[j] != val) {
                k++;
                nums[k]=nums[j];
            }    j++;

        }
            System.out.print(Arrays.toString(nums));
            return k+1;
        }

}
