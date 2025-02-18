package PracticeInterview.AllProgram;

import java.util.Hashtable;
import java.util.Map;

public class MajorityApperaedPractice_Leetcode {
    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 1, 2, 2, 3};
       System.out.println("majority appeared number is  " +majorityNumVerify(nums));
    }

    private static int  majorityNumVerify(int[] nums) {

        int majorlength=nums.length/2;
        Map<Integer,Integer> map=new Hashtable<>();
        for(int num: nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>majorlength)
                return num;
        }
        return -1;
    }
}
