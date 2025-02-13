package PracticeInterview.ArraysProgram;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,8};
        int n=8;

        System.out.println(missingnumber(arr,n));
    }

    private static int  missingnumber(int[] arr, int n) {

        int expectedsum=0;
        int actualsum=0;
        expectedsum=n*(n+1)/2;
        for(int num:arr)
        {
            actualsum+=num;
        }
        return expectedsum-actualsum;
    }
}
