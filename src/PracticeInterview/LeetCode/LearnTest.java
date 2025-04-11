package PracticeInterview.LeetCode;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class LearnTest {
    public static void  main(String[] args)
    {
        int[] arr={1,2,8,4,7,10,3,5};
        int[] temp=new int[arr.length];
        int left=0;
        int right=arr.length-1;
        mergeSort(arr,temp,left,right);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr, int[] temp, int left,int right)
    {
        if(left<right)
        {
            int mid=(right+left)/2;
            mergeSort(arr,temp,left,mid);
            mergeSort(arr,temp,mid+1,right);
            mergeArray(arr,temp,left,mid,right);
        }
    }
    public static void mergeArray(int[] a,int[] temp, int left,int mid,int right)
    {
        int temp_pos=left;
        int left_end=mid;
        int right_start=mid+1;
        int start=left;
        int end=right;
        while(left<=left_end && right_start<=right)
        {
            if(a[left]<=a[right_start])
            {
                temp[temp_pos]=a[left];
                temp_pos=temp_pos+1;
                left=left+1;


            } else {
                temp[temp_pos]=a[right_start];
                temp_pos=temp_pos+1;
                right_start=right_start+1;
            }
        }
        while(left<=left_end)
        {
            temp[temp_pos++]=a[left++];
        }
        while(right_start<=right)
        {
            temp[temp_pos++]=a[right_start++];
        }
        for(int i=start;i<=end;i++)
        {
            a[i]=temp[i];

        }

    }
}
