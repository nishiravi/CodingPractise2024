package PracticeInterview.PracticeString;

import java.util.Arrays;

public class LongestWord {
    public static void main(String[] args) {
        String data = "Java is an amazing programming language";
        String[] arr = data.split(" ");
        String longestword = "";
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > longestword.length()) {
                longestword = arr[i];
            }

        }
        System.out.println("longest word is " + longestword);
    }
}
