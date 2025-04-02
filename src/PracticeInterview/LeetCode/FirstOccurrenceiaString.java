package PracticeInterview.LeetCode;

public class FirstOccurrenceiaString {
    //https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
    public static void main(String[] args) {
        String hashtag = "ggsadbutsad";
        String needle = "sad";
        for (int i = 0; i < hashtag.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) != hashtag.charAt(i + j)) {
                    break;
                }
                if (j == needle.length() - 1) {
                    System.out.println(i);
                    return ;
                }
            }
        }
    }
}
