package PracticeInterview.LeetCode;

public class LengthOfLastWord {
    //https://leetcode.com/problems/length-of-last-word/description/
    public static void main(String[] args) {
       String s=" fly me   to   the moon  ";
        System.out.print(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        String[] words=s.split(" ");
        String word=words[(words.length)-1];
        return word.length();
    }
}
