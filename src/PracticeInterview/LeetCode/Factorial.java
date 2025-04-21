package PracticeInterview.LeetCode;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));

    }

//    public static int fact(int n) {
//        if (n == 0) {
//            return 0;
//
//        } else if (n == 1) {
//            return 1;
//        } else {
//            return n*fact(n-1);
//        }
//    }

    // without recursion
    public static int fact(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *=  i;
        }
        return fact;
    }
}
