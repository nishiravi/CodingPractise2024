package Programs;

import java.util.HashSet;

public class HappyNumbers_Leetcode {
    //https://leetcode.com/problems/happy-number/description/
    public static void main(String[] args) {

        int n = 2;
        System.out.println(verifyhappynumber(n));
    }

    public static boolean verifyhappynumber(int n) {
        HashSet<Integer> set = new HashSet<>(); // two store the sum value which is square value of 2 digits
        while (n != 1) {
            int sum = getSquareofnum(n); // get the square of each digit
            if (set.contains(sum)) {
                return false; // if the sum value present in the set then repeated loop is started
            }

            set.add(sum); // if sum value not present then add to the set
            n = sum; // that becomes the next n value , loop repeats till n value =1;
        }
        return true;
    }

    private static int getSquareofnum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
