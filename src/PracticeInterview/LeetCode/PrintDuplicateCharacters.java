package PracticeInterview.LeetCode;

public class PrintDuplicateCharacters {
    public static void main(String[] args) {
        String s=" Java Automation ";
        boolean[] unique=new boolean[128];
        System.out.println("Duplicate characters are");
        for(int i=0;i<s.length();i++)
        {
            if(unique[s.charAt(i)])
            {
                System.out.print(s.charAt(i));
            }
            else {
                unique[s.charAt(i)]=true;
            }
        }
    }
}
