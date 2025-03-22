package PracticeInterview.LeetCode;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,3,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n: nums)
        {
            if(map.containsKey(n))
            {
                map.put(n,map.get(n)+1);
            }
            else {
                map.put(n,1);
            }
        }
        for(int n: map.keySet())
        {
            if(map.get(n)>nums.length/2)
            {
                System.out.println(n);
            }
        }
    }
}
