package PracticeInterview.LeetCode;

public class StringCombinations {
    public static void main(String[] args) {

        String s="abc";
        String prefix="";
        findPermutations(s,prefix);
    }
    public static void findPermutations(String str,  String prefix)
    {

       if( str.length()==0)
       {
           System.out.println(prefix);
       }
       else {
           {

               String  remainString= str.substring(1);
               findPermutations(remainString,prefix+ str.charAt(0));
               findPermutations(remainString,prefix);

           }
       }
    }
}
