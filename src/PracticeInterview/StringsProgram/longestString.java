package PracticeInterview.StringsProgram;

import java.util.HashSet;
import java.util.Set;

public class longestString {
    public static void main(String[] args) {
        String s="abcabcabc";
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray())
        {
            set.add(c);
        }

    }
}
