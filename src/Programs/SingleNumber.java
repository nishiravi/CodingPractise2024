package Programs;

import java.util.Scanner;

public class SingleNumber {

    public static void main(String[] args)
    {
      int[] nums={2,2,1,1,5};
      System.out.println(singleNumberCheck(nums));
    }
    public static int singleNumberCheck(int[] nums)
    {
        int result=0;
        for(int num:nums)
        {
            result^=num;
        }
        return result;
    }
}
