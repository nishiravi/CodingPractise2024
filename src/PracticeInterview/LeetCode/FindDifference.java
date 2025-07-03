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
        Set<Character> set1=new HashSet<>();
        Set<Character> set2=new HashSet<>();
         for(char a: s.toCharArray())
         {
             set1.add(a);
         }
        for(char b: t.toCharArray())
        {
            set2.add(b);
        }
        for(char c:set1)
        {
            if(!(set2.contains(c)))
            {
                return c;
            }
        }
        return t.charAt(t.length()-1);
    }
}
