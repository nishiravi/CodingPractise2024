package PracticeInterview.LeetCode;

public class MaxMinNumberPalindrome {
    public static void main(String[] args) {
        int n = 100;
        checkNumberPalindrome(n);
    }
    public static void checkNumberPalindrome(int n) {
        int min = n - 1;
        int max = n + 1;
        while (true) {
            if (palindrome(min) == true) {
                System.out.println(min);
                return;
            }
            if (palindrome(max) == true) {
                System.out.println(max);
                return;
            }
            min--;
            max++;
        }
    }

    public static boolean palindrome(int n) {
        String stringnum = String.valueOf(n);
        int left = 0;
        int right = stringnum.length() - 1;
        {
            while (left <= right) {
                if (stringnum.charAt(left) != stringnum.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}
