package PracticeInterview.LeetCode;

public class ReversePrintSentence {
    public static void main(String[] args) {
        String s="java is fun to learn ";
        String[] newArray=s.split(" ");
        for(int i=newArray.length-1;i>=0;i--)
        {
            System.out.print(newArray[i]+" ");
        }

    }
}
