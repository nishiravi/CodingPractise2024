package PracticeInterview.LeetCode;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {

        Scanner sc=new Scanner((System.in));
        int data=sc.nextInt();
        int sum=0;
        int temp=data;
        while(temp>0)
        {
            int digit=temp%10;
           sum=sum+digit;
            temp=temp/10;
        }
      System.out.print(sum);
    }
}
