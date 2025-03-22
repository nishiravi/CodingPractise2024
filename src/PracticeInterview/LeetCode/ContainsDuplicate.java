package PracticeInterview.LeetCode;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3,1 };
       System.out.println(duplicate(nums));
    }
    public static boolean duplicate(int[] num)
    {

        HashSet<Integer> set=new HashSet<>();
        for(int n:num)
        {
            if(set.contains(n))
            {
                return true;
            } else {
                set.add(n);
            }
        }
        return false;
    }
}
