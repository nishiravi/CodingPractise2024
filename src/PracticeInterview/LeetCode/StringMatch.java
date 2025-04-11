package PracticeInterview.LeetCode;

public class StringMatch {
    // Karmanchi BrutForce-Page no 322
    public static void main(String[] args) {
        // check if string P matches with String T
        String[] t = {"a", "o", "p", "t", "o", "p"};
        String[] p = {"t", "o", "p"};
        System.out.print(checkStringMatch(t, p));
    }

    private static int checkStringMatch(String[] t, String[] p) {
        int n = t.length - 1;
        int m = p.length - 1;
        for (int i = 0; i <= n - m; i++) // iterate through t string
        {
            int j = 0; // iterate through p string
            while (j <= m && (p[j] == t[i + j])) {
                if (j == m) { // check if j reached the end of index of string P
                    return 1;
                }
                j++;
            }
        }
        return -1;
    }

}

