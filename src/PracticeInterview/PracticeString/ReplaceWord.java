package PracticeInterview.PracticeString;

import java.util.Arrays;

public class ReplaceWord {
    public static void main(String[] args) {
        String data = "I love java";
        String wordToReplace = "java";
        String replacement = "Python";
        StringBuilder sb = new StringBuilder(data.toLowerCase());
        int i = sb.indexOf(wordToReplace.toLowerCase());
        if (i != -1) {
            sb.replace(i, i + wordToReplace.length(), replacement);
        }
        System.out.println(sb);
    }
}
