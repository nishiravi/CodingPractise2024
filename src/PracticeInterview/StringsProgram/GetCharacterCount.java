package PracticeInterview.StringsProgram;

public class GetCharacterCount {
    public static void main(String[] args) {
        String s="aabbcccdd";
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int count=1;
            while(i+1<s.length() && c==s.charAt(i+1))
            {
                count++;
                i++;
            }
            result.append(c).append(count);
        }
        System.out.print(result.toString());
    }
}
