package PracticeInterview.LeetCode;

public class StringPermutations {
    public static void main(String[] args) {
      //if a string length is n then num of permutation is n!, bellow example n=3, n!=6
        String s="abcd";
        String prefix="";
        findPermutations(s,prefix);
    }
    public static void findPermutations(String str,String prefix)
    {
       if(str.isEmpty())
       {
           System.out.println(prefix);
       }
       else {
           for(int i=0;i<str.length();i++)
           {
               String remainString=str.substring(0,i) +str.substring(i+1);
               findPermutations(remainString,prefix+ str.charAt(i));
           }
       }
    }
}
