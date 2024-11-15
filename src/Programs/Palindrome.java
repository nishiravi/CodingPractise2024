package Programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        System.out.println("input string    " + data);
        int right = data.length() - 1;
        int left = 0;
        boolean isPalindrome=true;
        for(int i=0;i<data.length();i++)
        {
            if(data.charAt(left)!=data.charAt(right))
            {
                isPalindrome=false;
                break;
            }
        }

        if(isPalindrome==true)
            System.out.println(data+ " is a palindrome");
        else
            System.out.println(data+" is not palindrome");
    }
}
