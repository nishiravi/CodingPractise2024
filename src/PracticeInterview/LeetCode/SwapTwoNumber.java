package PracticeInterview.LeetCode;

public class SwapTwoNumber {
    public static void main(String[] args) {

        int a=3;
        int b=2;
        System.out.println("before swapping a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping a="+a+" b="+b);
    }
}
