package Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings_Leetcode {
    //https://leetcode.com/problems/isomorphic-strings/description/
    public static void main(String[] args) {

        String s="foo";
        String t="cap";
        System.out.println(verifyIsomorphic(s,t));
    }

    public static boolean verifyIsomorphic(String s, String t)
    {
        // if both string length dont match then its not Isomorphic
        if(s.length()!=t.length())
        {
            return false;
        }
        // for mapping
        HashMap<Character,Character> sTOt=new HashMap<>();
        HashMap<Character,Character> tTOs=new HashMap<>();
        //to iterate over each character of both the string
        for(int i=0;i<s.length();i++)
        {
            // fetching each character from the two strings
            char charS=s.charAt(i);
            char charT=t.charAt(i);
            // mapping the characters of charS with charT
            if(sTOt.containsKey(charS))
            {
                if(sTOt.get(charS)!=charT)
                {
                    return false; // already mapping is done
                }
            }
            else {
                sTOt.put(charS,charT); // map character  s->t
            }
            // mapping the characters of charT with charS
            if(tTOs.containsKey(charT))
            {
                if(tTOs.get(charT)!=charS)
                {
                    return false; // already mapping is done
                }
            }
            else {
                tTOs.put(charT,charS); // map character  t->s
            }

        }
        return true;
    }
}
