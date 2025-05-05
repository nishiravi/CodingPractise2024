package PracticeInterview.ArraysProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(5);
        Set<Integer> set=new HashSet<>();
        for(int n:arrayList)
        {
            set.add(n);
        }
        ArrayList<Integer> unique=new ArrayList<>(set);
        System.out.print(unique);

    }
}
