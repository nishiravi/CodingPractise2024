package PracticeInterview.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numrow = 5;
        List<List<Integer>> result=generateTriangle(numrow);
        System.out.print(result);
    }

    private static List<List<Integer>> generateTriangle(int numrow) {
        List<List<Integer>> result = new ArrayList<>();
        if(numrow==0) return result;
        List<Integer> firstrow=new ArrayList<>();
            firstrow.add(1);
            result.add(firstrow); // makinf first row as always 1
        if(numrow==1) return result;
       for(int i=1;i<numrow;i++)
       {
           List<Integer> prev=result.get(i-1);
           List<Integer> row=new ArrayList<>();
           row.add(1);// first value of a row is 1
           for(int j=0;j<i-1;j++)
           {
              row.add(prev.get(j)+prev.get(j+1));
           }
           row.add(1);
           result.add(row);
       }
        return result;

    }
}
