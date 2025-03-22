package PracticeInterview.LeetCode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        String s = "([]";
        System.out.println(checkvalidparenthesis(s));
    }

    public static boolean checkvalidparenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                switch (s.charAt(i)) {
                    case ')':
                        if (stack.pop() != '(') {
                            return false;
                        }
                        break;
                    case '}':
                        if (stack.pop() != '{') {
                            return false;
                        }
                        break;
                    case ']':
                        if (stack.pop() != '[') {
                            return false;
                        }
                        break;
                    default:
                        System.out.println("invalid data");
                        return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}


