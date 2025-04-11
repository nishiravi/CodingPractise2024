package PracticeInterview.LeetCode;

public class BackTrackArray
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int i=arr.length-1;
        backtrackArray(i,arr);
    }

    private static void backtrackArray(int i,int[] arr) {

        if(i>=0)
        {

            System.out.println(arr[i]);
            backtrackArray(i-1,arr);
        }
    }
}
