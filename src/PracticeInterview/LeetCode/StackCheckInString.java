package PracticeInterview.LeetCode;

public class StackCheckInString {
    public static void main(String[] args) {
        // refer karumanchi note page :93
        String s = "sxxs";
        if(isValidStack(s))
        {
            System.out.print(" push , pop successful ");
        }
        else {
            System.out.print(" pop not successful");
        }
    }

    private static boolean isValidStack(String s) {
        int countOfS = 0;
        int i=0;
        while(i<s.length())
        {

            if (s.charAt(i) == 's') {
                countOfS++;
            } else if (s.charAt(i) == 'x') {
                countOfS--;
            }
            if (countOfS < 0) {
                return  false;
            }
            i++;
        }
        return true;
    }
}
