package PracticeInterview.LeetCode;

public class Validmountionarray_BinarySearch {
    //https://leetcode.com/problems/valid-mountain-array/description/
    public static void main(String[] args) {
        int[] arr = {0,3,2,1};
        var i = mountainornot_BS(arr);
        if(i != -1)
        {
            System.out.println(" yes its mountain " + i + " " + arr[i]);
        } else {
            System.out.println("Not a mountain");
        }

    }

    public static int mountainornot_BS(int[] arr) {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(high + low)/2;
            if(mid!=0 && mid!= arr.length-1 && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid]<arr[mid+1])
            {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;
    }
}
