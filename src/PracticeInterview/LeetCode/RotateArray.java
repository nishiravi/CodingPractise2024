package PracticeInterview.LeetCode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] num = {-1,-100,3,99};
        int n=num.length-1;
        int k = 2;
        reverseArray(0, n-k, num);
        reverseArray(k, num.length -1, num);
        reverseArray(0, num.length - 1, num);
        System.out.println(Arrays.toString(num));
//        while(n<k)
//        {
//            int temp=num[num.length-1];
//            for(int i=num.length-1;i>0;i--)
//            {
//                num[i]=num[i-1];
//            }
//            num[0]=temp;
//            k++;
//        }
        //System.out.println(Arrays.toString(num));
    }

    public static void reverseArray(int n, int k, int[] num) {
        while (n < k) {
            int temp = num[n];
            num[n] = num[k];
            num[k] = temp;
            n++;
            k--;
        }

    }
}
