package PracticeInterview.LeetCode;

public class Armstrong {
    public static void main(String[] args) {
        int n=153;
        System.out.print(checkArmstron(n));

    }

    private static boolean checkArmstron(int n) {
        int sum = 0;
        int data=n;
        while(data>0)
        {
          int temp=data%10;
          sum+=temp*temp*temp;
          if(sum==n)
          {
              return true;
          }
            data=data/10;
        }
           return false;

    }
}
