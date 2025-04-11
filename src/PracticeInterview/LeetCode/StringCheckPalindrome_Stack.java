package PracticeInterview.LeetCode;

import java.util.Stack;

public class StringCheckPalindrome_Stack {
    public static void main(String[] args) {

        String s = "ababXbaba";
        System.out.print(ispalindrome(s));
    }

    public static boolean ispalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (s.charAt(i) != 'X') {
            stack.push(s.charAt(i));
            i++;
        }
        i++;
        while (i < s.length()) {
            if (stack.empty()) {
                return false;
            }
            if (stack.pop() != s.charAt(i)) {
                return false;
            }
            i++;
        }
        if(!stack.empty())
        {
            return false;
        }
        return true;
    }
}
