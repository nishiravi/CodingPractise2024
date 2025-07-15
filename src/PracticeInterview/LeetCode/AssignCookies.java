package PracticeInterview.LeetCode;

import java.util.Arrays;

public class AssignCookies {
    //https://leetcode.com/problems/assign-cookies/description/
    public static void main(String[] args) {
        int[] g = {2,2,3};
        int[] s={1,1};
        int result=findContentChildren(g,s);
        System.out.print(result);
    }

    private static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int result=0;
        for(int n: g)
        {
            // check if is the cookie size is more than children content value
            while(i<s.length && s[i]<n)
            {
                i++; //check  next children content to  assgin

            }
            if(i==s.length)
            {
                return result; // once all  the value of s array is done

            }else
            {
                i++; // the value of content is less than or equal to assign cookies value
                result++;
            }

        }
        return result;
    }
}
