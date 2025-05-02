package PracticeInterview.LeetCode;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
        int missingnumber=findMissingNumber(arr);
        System.out.print(missingnumber);
    }
    public static int findMissingNumber(int[] arr)
    {
      int n=arr.length+1 ; // this includes arr size with the missing number
      int totalSum=n*(n+1)/2  ;// math formula to get Sum of first n natural numbers
        int sumOfArray=0;
        for(int num: arr)
        {
            sumOfArray+=num;
        }
        return totalSum-sumOfArray; // this formula gives the missing number
    }
}
