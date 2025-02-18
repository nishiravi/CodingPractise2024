package PracticeInterview.AllProgram;

public class ReverseStringNoBulitIn {
    public static void main(String[] args) {

        String str = "Automation";
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.println(str.charAt(i));
        }
    }
}
