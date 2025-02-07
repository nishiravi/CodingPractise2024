package PracticeInterview;

public class palindrome {
    public static void main(String[] args) {
//
        String str = "mada";
        int right = str.length() - 1;
        int left = 0;
        boolean ispalindrome = true;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                ispalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (ispalindrome == true)
            System.out.println(str + " is plaindrome");
        else
            System.out.println(str + " is not a palindrome");

    }
    }


