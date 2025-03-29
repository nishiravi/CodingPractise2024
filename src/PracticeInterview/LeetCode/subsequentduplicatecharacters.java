package PracticeInterview.LeetCode;

import java.util.LinkedHashSet;
import java.util.Set;

public class subsequentduplicatecharacters {
    //Remove the subsequent duplicate characters in a string until you get a unique set of characters.
    public static void main(String[] args) {
        String a="eeaabbcdf";
        System.out.println(removeDuplicateSubs(a));
    }

    private static String removeDuplicateSubs(String a) {
        StringBuilder result=new StringBuilder();
        result.append(a.charAt(0)); // by default append first character
        for(int i=1;i<=a.length()-1;i++)
        {
            if(a.charAt(i)!=a.charAt(i-1)) // whenever value not equal we add to the string
            {
                result.append(a.charAt(i));
            }
        }
        return result.toString();
    }
    }




