package PracticeInterview.LeetCode;

public class removeDuplicateprint {
    public static void main(String[] args) {
        String s="aabbcdddcaa";
        for(int i=0;i<s.length();i++)
        {
            if( i==0 || s.charAt(i)!=s.charAt(i-1) )
            {
                System.out.print(s.charAt(i));
            }

        }
    }
}
