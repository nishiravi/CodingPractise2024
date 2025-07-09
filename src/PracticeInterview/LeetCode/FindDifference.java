package PracticeInterview.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class FindDifference {
    public static void main(String[] args) {
        String s="";
        String t="y";
        char result=findTheDifference(s,t);
        System.out.print(result);
    }

    private static char findTheDifference(String s, String t) {
      char result=0;

         for(char a: s.toCharArray())
         {
             result^=a;
         }
        for(char b: t.toCharArray())
        {
            result^=b;
        }

        return result;
    }
}
