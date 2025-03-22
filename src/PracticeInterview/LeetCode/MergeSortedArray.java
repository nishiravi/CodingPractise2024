package PracticeInterview.LeetCode;

import java.util.ArrayList;

public class MergeSortedArray {
    public static void main(String[] args) {

        int[] num1 = {2, 5, 6, 8};
        int[] num2 = {1, 5, 8, 9};
        ArrayList<Integer> mergedArray = new ArrayList<>();
      int i=0,j=0;
        while(i<=num1.length-1 && j<=num2.length-1){
                if (num1[i] <= num2[j]) {
                    mergedArray.add(num1[i]);
                    i++;
                } else {
                    mergedArray.add(num2[j]);
                    j++;
                }
            }
        while(i<=num1.length-1){

            mergedArray.add(num1[i]);
            i++;
        }
        while(j<=num2.length-1) {

            mergedArray.add(num2[j]);
            j++;
        }
        System.out.println(mergedArray);
    }
}
