package PracticeInterview.PracticeString;

public class ReplaceCharacter {
    public static void main(String[] args) {
      // input string
       String data="bananananakkaa";
       char oldchar='a';
       char newchar='o';
       replacechar(data,oldchar,newchar);
    }

    public static void replacechar(String data,char olchar,char newchar)
    {
        StringBuilder sb=new StringBuilder(data);
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)==olchar)
            {
                sb.setCharAt(i,newchar);
            }
        }
        System.out.println(sb);
    }
}
