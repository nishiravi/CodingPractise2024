package PracticeInterview.LeetCode;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        int target = 0;
        for (int i = 0; i < nums.length-3; i++) {
            int temp = nums[i] - target;
            int left = i + 1;
            int right = nums.length - 1;
            while (left <= right) {
                if ((nums[left] + nums[right]) == temp) {
                    System.out.println(nums[i] + "," + nums[left] + "," + nums[right]);
                    left++;
                    right--;
                } else if ((nums[left] + nums[right]) < temp) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
}

