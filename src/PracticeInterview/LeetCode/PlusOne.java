package PracticeInterview.LeetCode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        int[] num={9,9,9};
        int flag=1;
        for(int i=num.length-1;i>=0;i--)
        {
            num[i]=num[i]+1;
            if(num[i]<10){
                flag=0;
                System.out.println(Arrays.toString(num));
                break;
            } else {
                    num[i]=0;
            }
        }
        if(flag==1)
        {
           int[] newArray=new int[num.length+1];
           newArray[0]=1;
           System.arraycopy(num,0,newArray,1,num.length);
           System.out.println(Arrays.toString(newArray));
        }
    }
}
