package PracticeInterview.LeetCode;

public class Anagaram {

    public static void main(String[] args) {

        String s = "Anaram";
        String t = "naaoam";
        System.out.println(checkAnagram(s, t));
    }
    public static boolean checkAnagram(String s, String t)
    {
        if(s.length()!=t.length()){
            return false;
        } else{
            int[] countofS=new int[256];// // Frequency array for all ASCII characters
            for(char c:s.toLowerCase().toCharArray())
            {
                countofS[c]++; /// Increment count at ASCII index of character
            }
            int[] countofT=new int[256];
            for(char a:t.toLowerCase().toCharArray())
            {
                countofT[a]++;
            }
            for(int i=0;i<countofT.length-1;i++)
            {
                if(countofT[i]!=countofS[i]) {
                    return false;
                }
            }

        }
        return true;
    }
}
