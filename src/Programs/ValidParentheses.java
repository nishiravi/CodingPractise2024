package Programs;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "[()]]";
        if (isValid(s)) {
            System.out.println(" String is a Valid Parentheses");
        } else
            System.out.println(" string is not Valid Parentheses");
    }

    public static boolean isValid(String s) {
        Stack<Character> braces = new Stack<>();

        for (char a : s.toCharArray()) {
            if (a == '(' || a == '{' || a == '[') {
                braces.push(a);
            } else {
                if(braces.isEmpty())
                    return false;
            }
            if (a == ')' && braces.peek().equals('(')) {
                braces.pop();
            } else if (a == ')') {
                break;
            }

            if (a == ']' && braces.peek().equals('[')) {
                braces.pop();
            } else if (a == ']') {
                break;
            }
            if (a == '}' && braces.peek().equals('{')) {
                braces.pop();
            }  else if (a == '}') {
                break;
            }
        }
        if (braces.isEmpty()) {
            return true;
        } else
            return false;

    }
}


