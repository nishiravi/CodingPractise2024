package PracticeInterview.LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    //https://leetcode.com/problems/two-sum/description/
    public static void main(String[] args) {

        int[] num = {1,2, 7,8, 11, 15};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= num.length - 1; i++) {
            map.put(num[i], i);

        }
        //System.out.println(map);
        for (int i = 0; i <= num.length - 1; i++) {
            if (map.containsKey(target - num[i]) && i != map.get(target - num[i])) {
                if(map.get(target-num[i])>i)// important
                    System.out.println(i + "," + map.get(target - num[i]));
            }

        }

    }

}

