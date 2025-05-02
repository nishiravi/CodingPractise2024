package PracticeInterview.LeetCode;

public class Validmountionarray {
    //https://leetcode.com/problems/valid-mountain-array/description/
    public static void main(String[] args) {
        int[]  arr = {1,2,3,2,2};
        System.out.println(mountainornot(arr));
    }
    public static boolean mountainornot(int[] arr)
    {
        int i=0,j=arr.length-1;
        while(i<arr.length)
        {
            if(arr[i]>arr[i+1] && arr[i]==arr[i+1])
            {
                break;
            }
            i++;
        }
        while(j>=0)
        {
            if(arr[j]>arr[j-1] && arr[j]==arr[j-1] )
            {
                break;
            }
            j--;
        }
        if(i==j)
        {
            return true;
        } else {
                return false;
        }
    }
}
