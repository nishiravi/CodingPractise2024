package Programs;

import java.util.ArrayList;
//https://leetcode.com/problems/climbing-stairs/description/
public class Climbingstaircase {
    public static void main(String[] args) {

        int n = 5;
        int numofWays= climbStairs(n);
        System.out.println(" number of ways to reach " + n + " stairs is  " + numofWays);
    }

    public static int climbStairs(int n) {
        int first = 1;
        int second = 2;
        if(n==1)
            return first;
        else if(n==2)
            return second;
        for (int i = 3; i <= n; i++) {

            int nthstairs = first + second;
            first = second;
            second = nthstairs;
        }
        return second;
    }
}
