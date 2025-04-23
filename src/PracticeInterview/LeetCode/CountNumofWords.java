package PracticeInterview.LeetCode;

public class CountNumofWords {
    public static void main(String[] args) {
        String s="  Welcome to Java World ";
        int count=1;
        for(int i=0;i<s.length()-1;i++)
        {
            // we are counting the space , each time  u find a space followed by word, count increment
          if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
          {
              count++;
          }
        }
        System.out.print(count);
    }

}
