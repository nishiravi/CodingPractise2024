package PracticeInterview.LeetCode;

public class Validmountionarray {
    //https://leetcode.com/problems/valid-mountain-array/description/
    public static void main(String[] args) {
        int[]  arr = {0,1,2,3,4,5,6,7,8,9};

        System.out.println(mountainornot(arr));
    }
    public static boolean mountainornot(int[] arr)
    {
        if(arr.length<=2)
        {
            return false;
        }
        else {
            int i = 0, j = arr.length - 1;
            while (i < arr.length - 1) {
                if (arr[i] > arr[i + 1] ||arr[i] == arr[i + 1]) {
                    break;
                }
                i++;
            }
            while (j > 0) {
                if (arr[j] > arr[j - 1] || arr[j] == arr[j - 1]) {
                    break;
                }
                j--;
            }
            if (i == j && i!=arr.length-1 && j!=arr.length-1 && j!=0 && i!=0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
