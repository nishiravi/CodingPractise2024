package Programs;

import java.util.Scanner;

public class FibonacciLAstDigit {
    public static void main(String[] args) {
        int num = 10;
        int first = 0, second = 1, sumofSeries = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < num; i++) {

            int next = first + second;
            if (next >= 10)
                break;
            System.out.print(next + " ");
            first = second;
            second = next;

        }

        System.out.println(" last digit in the series is " + second);

    }
}
