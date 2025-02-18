package PracticeInterview.AllProgram;

public class SingleNumberPractice_Leetcode {
    public static void main(String[] args) {

        int[] nums = {2, 2, 1,1,6};
        System.out.println("single appeared number is "+singleNumberVerify(nums));
    }

    private static int singleNumberVerify(int[] nums) {
        int result=0;
        for(int num:nums)
        {
            result^=num;
        }
        return result;
    }
}
