package PracticeInterview.LeetCode;

public class UglyNumber {
    public static void main(String[] args) {
        //https://leetcode.com/problems/ugly-number/description/
        int n = 0;
        if(n==0)
        {
            System.out.print("false");
        }
        while (n % 2 == 0) {
            n /= 2;
        }

        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        if (n == 1) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
