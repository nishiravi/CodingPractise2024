package PracticeInterview.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    //https://leetcode.com/problems/fizz-buzz/
    public static void main(String[] args) {
        int n=3;
        List<String> a=fizzBuzz(n);
        System.out.print(a);
    }

    private static List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<>();
        for(int i=1;i<=n;i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
               list.add("FizzBuzz");
            } else if ((i % 3 == 0)) {
                list.add("Fizz");
            } else if ((i % 5 == 0)) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
                //
            }
        }
        return list;
    }
}
