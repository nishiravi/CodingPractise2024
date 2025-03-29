package PracticeInterview.LeetCode;

public class Validmountionarray {
    //https://leetcode.com/problems/valid-mountain-array/description/
    public static void main(String[] args) {
        int[]  arr = {1,2,3,2,1};
        System.out.println(mountainornot(arr));
    }
    public static boolean mountainornot(int[] arr)
    {
        int i=0,j=arr.length-1;
        while(arr[i]<arr[i+1])
        {
            i++;
        }
        while(arr[j]<arr[j-1])
        {
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
