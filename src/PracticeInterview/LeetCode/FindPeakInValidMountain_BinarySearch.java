package PracticeInterview.LeetCode;

public class FindPeakInValidMountain_BinarySearch {
    //Input is a valid mountain , find the peak value only
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,2,1,0};
        int indx = mountainornot_BS(arr);
        if(indx != -1)
        {
            System.out.println(" yes its mountain ");
        } else {
            System.out.println("Not a mountain");
        }

    }

    public static int mountainornot_BS(int[] arr) {
        int low=0;
        int high=arr.length-1;
        while(low<high)
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
