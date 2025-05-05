package PracticeInterview.LeetCode;

import java.util.Arrays;

public class FindingOfSpans {
    public static void main(String[] args) {
        // refer karumanchi page no:24 problem 22
        int[] input={6,8,3,7,2};
        System.out.print(Arrays.toString(findSpan(input)));
    }

    private static int[] findSpan(int[] input) {
        int[] spans=new int[input.length];
        for(int i=0;i<input.length;i++)
        {
            int span=1;
            int j=i-1;
            while(j>=0 && input[j]<=input[i])
            {
                span+=1;
                j--;
            }
            spans[i]=span;
        }
        return spans;
    }
}
