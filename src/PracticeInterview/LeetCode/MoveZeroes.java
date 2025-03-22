package PracticeInterview.LeetCode;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] num={1,0,8,0,4,0,0};
       int i=0;
       for(int n:num)
       {
           if(n!=0)
           {
               num[i]=n;
               i++;
           }
       }
       while(i<num.length)
       {
           num[i]=0;
           i++;
       }
       System.out.println(Arrays.toString(num));
    }
}
