package PracticeInterview.LeetCode;

public class AddDigits {
    //https://leetcode.com/problems/add-digits/description/
    public static void main(String[] args) {
        int num=38;
        int result=addDigits( num);
        System.out.print(result);
    }
    public static int addDigits(int num)
    {
        int tempdata=0;
       while(num>9)
       {
         tempdata= calaculateSum(num);
         num=tempdata;
       }
       return num;
    }

    private static int calaculateSum(int num) {
        int temp=0;
        while(num!=0)
        {
            temp=temp+(num%10);
            num=num/10;
        }
        return temp;
    }
}
