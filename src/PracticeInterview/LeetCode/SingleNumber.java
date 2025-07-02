package PracticeInterview.LeetCode;

public class SingleNumber {
    //https://leetcode.com/problems/single-number/solutions/6904376/easy-brute-force-and-optimal-approach/
    public static void main(String[] args) {
        int[] nums={2,2,1};
        int temp=0;
        for(int n:nums)
        {
           temp=temp^n;
        }
        System.out.print(temp);
    }
}
