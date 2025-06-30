package PracticeInterview.LeetCode;

public class MajorityElement_MooreAlgorithm {
    public static void main(String[] args) {
        int [] num={2,2,1,1,1,2,2};
        int freq=0;
        int value=0;
        for(int n:num)
        {
           if(freq==0)
           {
               value=n;
           }
           if(value==n)
           {
               freq++;
           } else {
               freq--;
           }
        }
      System.out.print(value);
    }
}
