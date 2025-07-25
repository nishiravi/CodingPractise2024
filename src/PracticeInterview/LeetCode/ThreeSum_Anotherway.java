package PracticeInterview.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_Anotherway {
    public static void main(String[] args) {
        int[] nums = {0,1,0};
        System.out.println(verifyThreeSum(nums));
    }

    private static List<List<Integer>> verifyThreeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return new ArrayList<>(); // return empty list
        }
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 2; i++) {
            //// Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // Early termination if nums[i] > 0 (since array is sorted)
            if (nums[i] > 0) {
                break;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
