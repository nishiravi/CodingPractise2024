package PracticeInterview.LeetCode;

import java.util.*;

public class Practice {

    public static void main(String[] args) {
        String hashtag = "gsadbutsad";
        String needle = "sad";
       System.out.println( pcheck(hashtag, needle));
    }

    private static int pcheck(String hashtag, String needle) {

        for(int i=0;i<hashtag.length();i++)
        {
            for(int j=0;j<needle.length();j++)
            {
                if(hashtag.charAt(i+j)!=needle.charAt(j))
                {
                    break;
                }
                if(j==needle.length()-1)
                {
                    return i;
                }
            }

        }
        return 0;
    }

}