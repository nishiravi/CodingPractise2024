package Programs;

public class findMissingOneNumber {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,6,7};  // in the given sequence missing number is 5
        int n=7; // last number in thr given sequence
       System.out.println("Missing number is "+findMissingNumber(numbers, n));
    }

    public static int findMissingNumber(int[] numbers,int n)
    {
        int total=n*(n+1)/2; //(7*8)/2;
        int sum=0;
        for(int num:numbers)
        {

            sum+=num; //sum+num; loop over each number in the given array
        }
        return total-sum;
    }
}
