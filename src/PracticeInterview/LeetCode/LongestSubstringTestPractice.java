package PracticeInterview.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringTestPractice {
    public static void main(String[] args) {
        String s="aabaab!bb";
        Set<Character> set=new HashSet<>();
        int maxLength=0;
        int i=0,j=0;
        while(j<=s.length()-1)
        {
          if(!(set.contains(s.charAt(j))))
          {
              set.add(s.charAt(j));
              if(maxLength<=set.size())
              {
                  maxLength= set.size();
              }
          }
          else {
              while(s.charAt(i)!=s.charAt(j))
              {
                  set.remove(s.charAt(i));
                  i++;
              }
             i++;
          }
            j++;
        }
       System.out.print(maxLength);
    }
}
