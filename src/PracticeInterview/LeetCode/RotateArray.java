package PracticeInterview.LeetCode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] num = {2,5,6,8,9,10};
        int n=num.length-1;
        int k = 4;
        if(num.length==0)
        {
            return;
        }
        // when k is more than array length
        k=k%num.length;
        if(k==0)
        {
            return ; // even if u return it will be back to same input array
        }
        reverseArray(0, n-k,num);
        reverseArray(n-k+1, n, num);
        reverseArray(0, n, num);
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
        while (n <=k ) {
            int temp = num[n];
            num[n] = num[k];
            num[k] = temp;
            n++;
            k--;
        }

    }
}
