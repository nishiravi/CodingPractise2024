package PracticeInterview.LeetCode;

public class FirstOccurrenceiaString {
    //https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.print(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        for (int i = 0; i <=haystack.length()-needle.length(); i++) {
            for (int j = 0; j <= needle.length() - 1; j++) {
                if (i+j>haystack.length() - 1 ||needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
                if (j == needle.length() - 1) {
                    return i;
                }

            }
        }
        return -1;
    }
}
