package PracticeInterview.LeetCode;

public class IsSubsequence {
    //https://leetcode.com/problems/is-subsequence/description/
    //A subsequence of a string is a new string that is formed from the
    // original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
    // (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
    public static void main(String[] args) {

        String s = "axc", t = "ahbgdc";
        System.out.print(issubsequense(s, t));
    }

    public static boolean issubsequense(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < t.length() && j < s.length()) {
            if (t.charAt(i) != s.charAt(j)) {
                i++;
            } else {
                i++;
                j++;
            }
        }
        if(j==s.length() || s.isEmpty()) // remember this, is s="" as input
        {
            return true;
        }
return false;
    }
}
