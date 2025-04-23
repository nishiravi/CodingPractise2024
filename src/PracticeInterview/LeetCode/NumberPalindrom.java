package PracticeInterview.LeetCode;

import java.util.Scanner;

public class NumberPalindrom {
    public static void main(String[] args) {

        Scanner sc=new Scanner((System.in));
        int data=sc.nextInt();
        int reversenum=0;
        int temp=data;
        while(temp>0)
        {
            int digit=temp%10;
            reversenum=reversenum*10+digit;
            temp=temp/10;
        }
        if(data==reversenum)
        {
           System.out.print(" yes its palindrome");
        } else {
            System.out.print(" No its not a  palindrome");
        }

    }
}
