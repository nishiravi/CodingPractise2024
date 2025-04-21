package PracticeInterview.LeetCode;

public class FibonacciSeriesRange {
    public static void main(String[] args) {
        int n=6;
        checkFibonacci(n);
    }

    private static void checkFibonacci(int n) {

        int first=0;
        int second=1;
        System.out.print(first +" "+second);
        for(int i=2;i<=n;i++)
        {
            int temp=first+second;
            first=second;
            second=temp;
            System.out.print(" " +temp);
        }
    }
}
