package PracticeInterview.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class BestToBuyStock {
    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        System.out.println(returnMaxProfit(prices));
//        for (int i = 0; i < prices.length - 1; i++) {
//            for (int j = i + 1; j < prices.length - 1; j++) {
//                if (max < prices[j] - prices[i]) {
//                    max = prices[j] - prices[i];
//                }
//            }
//        }
//        System.out.println("maximum profit" + max);
    }


    public static int returnMaxProfit(int[] prices) {
        int maxProfit = 0;
        int minTillNow = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minTillNow) {
                minTillNow = prices[i];
            } else {
                int profit = prices[i] - minTillNow;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
