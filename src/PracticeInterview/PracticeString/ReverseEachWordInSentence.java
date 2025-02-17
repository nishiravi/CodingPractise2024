package PracticeInterview.PracticeString;

import java.util.Arrays;
import java.util.List;

public class ReverseEachWordInSentence {
    public static void main(String[] args) {
        String data = "java is fun";
        String[] arr = data.split(" ");
        for (int i = 0;i<=arr.length-1; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
           String result=sb.reverse().toString();
           System.out.print(result+" ");
        }
    }
}
