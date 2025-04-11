package PracticeInterview.LeetCode;

public class StringCheckPalindrome {
    public static void main(String[] args) {

       String s = "ababXbaba";
        int left = 0;
        int right = s.length() - 1;
        System.out.print(ispalindrome(s, left, right));
    }

    public static boolean ispalindrome(String s, int left, int right) {
        if (s.charAt(left) != 'X' && s.charAt(right) != 'X') {
            while (left <= right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                } else {
                    left++;
                    right--;
                }
            }
        }
        return true;
    }
}
