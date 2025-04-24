package PracticeInterview.StringsProgram;

public class CountNumofWords {
    public static void main(String[] args) {
        String s="Welcome to Java World";
        int count=1;
        for(int i=0;i<s.length()-1;i++)
        {
          if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
          {
              count++;
          }
        }
        System.out.println(count);
        // using array length
        String [] arrwords=s.split(" ");
        System.out.println(arrwords.length);
    }

}
