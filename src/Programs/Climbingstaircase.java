package Programs;

import java.util.ArrayList;

public class Climbingstaircase {
    public static void main(String[] args) {

        int n = 6;
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {

            int nthstairs = first + second;
            first = second;
            second = nthstairs;
        }
        System.out.println(" number of ways to reach " + n + " stairs is  " + second);
    }
}
