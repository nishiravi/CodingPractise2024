package PracticeInterview.LeetCode;

import java.util.Arrays;

public class AssignCookies {
    //https://leetcode.com/problems/assign-cookies/description/
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s={5,6};
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
            while(i<s.length && s[i]<n)
            {
                i++; // when the children content value is more than the cookie size
                // and we have next cookies to  assgin
            }
            if(i==s.length)
            {
                return result;

            }else
            {
                i++;
                result++;
            }

        }
        return result;
    }
}
