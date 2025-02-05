package Programs;

import java.util.Hashtable;
import java.util.Map;

public class MajorityElement_Leetcode {
    //https://leetcode.com/problems/majority-element/description/

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 2, 2, 3};
        majorityNumberCheck(nums);
        System.out.println("majority of appearance of number is  "+majorityNumberCheck(nums));
    }

    private static int majorityNumberCheck(int[] nums) {
        int majoritylength=nums.length/2;
        Map<Integer,Integer> map=new Hashtable<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>majoritylength)
                return num;
        }
        return -1;
    }
}
