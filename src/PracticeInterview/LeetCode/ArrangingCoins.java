package PracticeInterview.LeetCode;

import static java.lang.Math.max;

public class ArrangingCoins {
    //https://leetcode.com/problems/arranging-coins/description/
    public static void main(String[] args) {
        int n=8;
        int result=arrangeCoins(n);
        System.out.print(result);
    }
    public static int arrangeCoins(int n) {
       int low=1,high=n,result=0;
       while(low<=high)
       {
           int mid=low+(high-low)/2;
           //This formula calculates the total number of coins needed to make mid complete rows,sum of first k natural numbers:
           int coins=mid*(mid+1)/2;
           if(coins==n)
           {
               return (int) mid;
           }
           else if(coins<n)
           {
               low=mid+1;
           } else {
               high=mid-1;
           }

       }
return (int) high;
    }
}
