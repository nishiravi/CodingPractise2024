package PracticeInterview.LeetCode;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums); ///////////////////// need to sort if u r using binary search
        int target = 0;
        Set<List<Integer>> set=new HashSet<>();
        if(nums==null  || nums.length<3)
        {
            System.out.print("invalid");
            return;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum=nums[i]+nums[left]+nums[right];
                if (sum==target) {
                    set.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                } else if (sum< target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>(set);
        System.out.println(result);
    }
}


