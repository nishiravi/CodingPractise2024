package PracticeInterview.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberDisappered {
    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result=findDisappearedNumbers(nums) ;
        System.out.print(result);

        }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        List<Integer>result=new ArrayList<>();
        int a= nums.length;
        for(int n: nums)
        {
            set.add(n);
        }
        while(a>=1)
        {
            if(!(set.contains(a)))
            {
                result.add(a);
            }
            a--;
        }
        return result;
    }
}
