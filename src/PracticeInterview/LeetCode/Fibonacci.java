package PracticeInterview.LeetCode;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));

    }

    private static int fib(int n) {
        int first = 0;
        int second = 1;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else
            return fib(n - 1) + fib(n - 2);
    }
}

