package PracticeInterview.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArray {
    public static void main(String[] args) {
        Integer[] nums1 = {1, 2, 2, 1};
        Integer[] nums2 = {2, 2};
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }

        for(int n:set1)
        {
            if(set2.contains(n))
            {
                set3.add(n);
            }
        }
        System.out.println(set3);

    }

}
