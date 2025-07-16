package PracticeInterview.LeetCode;

import java.util.List;

public class CountNumofWords {
    public static void main(String[] args) {
        String s="  Welcome to Java World ";
       String[]  words=s.trim().split("\\s+");
       System.out.print(words.length);
    }

}
