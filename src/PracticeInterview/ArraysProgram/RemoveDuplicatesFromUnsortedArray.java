package PracticeInterview.ArraysProgram;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromUnsortedArray {
    public static void main(String[] args) {
        int[] arr={5,2,9,7,5,4,0,3,3};
        //Remove duplicates and preserve order	LinkedHashSet
        Set<Integer> set=new LinkedHashSet<>();
        for(int n:arr)
        {
        set.add(n);
        }
        int[] unique=new int[set.size()];
        int i=0;
        for(int n: set )
        {
            unique[i++]=n;
        }
        System.out.print(Arrays.toString(unique));
    }

}
