package PracticeInterview.PracticeString;

import java.util.Arrays;
import java.util.Collections;

public class StringAnagram {
    public static void main(String[] args) {
        String data1 = "listen";
        String data2 = "silent";
        if (data1.length() != data2.length()) {
            System.out.println(" not anagram");
        } else {
            char[] a = data1.toLowerCase().toCharArray();
            Arrays.sort(a);
            char[] b = data1.toLowerCase().toCharArray();
            Arrays.sort(b);
            Arrays.equals(a, b);
            System.out.println(" String is anagram");
        }

    }
}
