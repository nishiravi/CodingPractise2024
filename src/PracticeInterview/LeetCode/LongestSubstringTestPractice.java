package PracticeInterview.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringTestPractice {
    public static void main(String[] args) {
        String s="pwwkew";
        Set<Character> set=new HashSet<>();
        int maxLength=0;
        int i=0,j=0;
        while(j<=s.length()-1)
        {
          if(!(set.contains(s.charAt(j)))) // when character not present add to the set
          {
              set.add(s.charAt(j));
              if(maxLength<=set.size())
              {
                  maxLength= set.size();
              }
          }
          else {
              //when character is already present
              while(s.charAt(i)!=s.charAt(j))
              {
                  // when the character at i and character at j
                  // is different remove the i character
                  set.remove(s.charAt(i));
                  i++;
              }
             i++; //when the character at i and character at j is same.
          }
            j++;
        }
       System.out.print(maxLength);
    }
}
