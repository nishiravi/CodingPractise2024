package PracticeInterview.LeetCode;

public class RemoveSpaces {
    public static void main(String[] args) {
        String s="Welcome to java";
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                result.append(s.charAt(i));
            }
        }
        System.out.print(result.toString());
    }
}
