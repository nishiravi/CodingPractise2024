package PracticeInterview.LeetCode;

public class PrintUniqueCharacters {
    public static void main(String[] args) {
        String s=" Java Automation ";
        boolean[] unique=new boolean[128];
        for(int i=0;i<s.length();i++)
        {
            if(!unique[s.charAt(i)])
            {
                unique[s.charAt(i)]=true;
                System.out.print(s.charAt(i));
            }
        }
    }
}
