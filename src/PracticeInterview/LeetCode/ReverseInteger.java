package PracticeInterview.LeetCode;

public class ReverseInteger {
    public static void main(String[] args) {
        int n = 15289;
        reverseInteger(n);
    }

    private static void reverseInteger(int n) {
        while (n > 0) {
            int reversenum = n % 10;
            System.out.print(reversenum);
            reverseInteger(n / 10);
        }
    }
}
