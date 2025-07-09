package PracticeInterview.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {
    public static void main(String[] args) {
        int n = 2;
        boolean result = findHappyNumbers(n);
        System.out.print(result);
    }

    private static boolean findHappyNumbers(int n) {
        Set<Integer> set=new HashSet<>();
        while (true) {
            int sum = 0;
            while (n != 0) {
                sum = (int) (sum + Math.pow(n % 10, 2.0));
                n = n / 10;
            }
            if (sum == 1) return true;
            n=sum;
            if(set.contains(n)) return false;
            set.add(n);

        }

    }
}

