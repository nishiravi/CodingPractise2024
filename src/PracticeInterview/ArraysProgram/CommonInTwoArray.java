package PracticeInterview.ArraysProgram;

import java.util.HashSet;
import java.util.Set;

public class CommonInTwoArray {
    public static void main(String[] args) {
        int[] a1={1,2,3,4,5};
        int[] a2={4,5,6,8};
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int n:a1)
        {
            set1.add(n);
        }
        for(int n:a2)
        {
            set2.add(n);
        }
        for(int n:set1)
        {
            if(set2.contains(n))
            {
                System.out.println(n);
            }
        }
        }
    }