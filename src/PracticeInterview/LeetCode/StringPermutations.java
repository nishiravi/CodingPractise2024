package PracticeInterview.LeetCode;

public class StringPermutations {
    public static void main(String[] args) {

        String s="abc";
        String prefix="";
        findPermutations(s,prefix);
    }
    public static void findPermutations(String str,String prefix)
    {
       if(str.length()==0)
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
