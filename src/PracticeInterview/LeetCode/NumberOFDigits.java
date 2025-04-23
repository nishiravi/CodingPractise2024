package PracticeInterview.LeetCode;

public class NumberOFDigits {
    public static void main(String[] args) {
        int n=0;
        checkNumberofDigit(n);

    }

    private static void checkNumberofDigit(int n) {
        int countCal=0;
        int data=n;
        if(n==0)
        {
            System.out.print("1");
            return;
        }
        while(data>0)
        {
          int temp=data%10;
          countCal++;
          data=data/10;
        }
         System.out.print("No of digits "+countCal);

    }
}
