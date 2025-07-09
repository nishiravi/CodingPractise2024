package PracticeInterview.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindNumDisappeared {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,9};
        List<Integer> result=newfindDifference(nums);
        System.out.print(result);
    }

    private static List<Integer> newfindDifference(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int i= 1;
        List<Integer> result = new ArrayList<>();
        for(int n:nums)
        {
            set.add(n);
        }
        while(i<nums[nums.length-1])
        {
            if(!set.contains(i))
            {
                result.add(i);
            }
            i++;
        }
        return result;

    }
}
