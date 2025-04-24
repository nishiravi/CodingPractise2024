package PracticeInterview.StringsProgram;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] num={1,0,8,0,4,0,0};
       int i=num.length-1;
       for(int n:num)
       {
           if(n!=0)
           {
               num[i]=n;
               i--;
           }
       }
       while(i>=0)
       {
           num[i]=0;
           i--;
       }
       System.out.println(Arrays.toString(num));
    }
}
