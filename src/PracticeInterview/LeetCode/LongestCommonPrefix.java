package PracticeInterview.LeetCode;

public class LongestCommonPrefix {
    //https://leetcode.com/problems/longest-common-prefix/description/
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.print(findPrefix(strs));
    }

    private static String findPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() - 1 < i || c != strs[j].charAt(i)) {
                    return prefix.toString();
                }
            }
            prefix.append(c);
        }
            return prefix.toString();
        }
    }


