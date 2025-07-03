package PracticeInterview.LeetCode;

import java.util.*;

public class ThirdMaximumNumber {
    //https://leetcode.com/problems/third-maximum-number/description/
    public static void main(String[] args) {

        int[] nums={8,9,10,2};
        int result=thirdMax(nums);
        System.out.print(result);
    }
    public static int thirdMax(int[] nums) {
        int firstMax=Integer.MIN_VALUE,secondMax=Integer.MIN_VALUE,thirdMax=Integer.MIN_VALUE;
        for(int n: nums)
        {
            if(n==firstMax || n==secondMax || n==thirdMax)
                continue;
            else if (n>firstMax) {
                thirdMax=secondMax;
                secondMax=firstMax;
                firstMax=n;
            } else if (n>secondMax)
            {
                thirdMax=secondMax;
                secondMax=n;
            } else if (n>thirdMax)
            {
                thirdMax=n;
            }
        }
       return thirdMax==Integer.MIN_VALUE? firstMax:thirdMax;
    }
}
