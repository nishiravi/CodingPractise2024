package PracticeInterview.LeetCode;

public class BackTrackArray
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int i=0;
        backtrackArray(i,arr);
    }

    private static void backtrackArray(int i,int[] arr) {

        if(i<=arr.length-1)
        {
            backtrackArray(i+1,arr);
            System.out.println(arr[i]);
        }
    }
}
