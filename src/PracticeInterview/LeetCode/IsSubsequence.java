package PracticeInterview.LeetCode;

public class IsSubsequence {
    public static void main(String[] args) {

        String s = "hg", t = "ahbgdc";
        issubsequense(s, t);
    }

    public static void issubsequense(String s, String t) {
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
        if(j==s.length())
        {
            System.out.println(true);
        }

    }
}
