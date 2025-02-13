package PracticeInterview.ArraysProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr={1,1,2,4,5,5,7,8,8};
        System.out.println(verifyDuplicateelement(arr));
    }

    private static Set<Integer> verifyDuplicateelement(int[] arr) {

        Set<Integer> seen=new HashSet<>();
        Set<Integer> duplicateStore=new HashSet<>();
        for(int n:arr)
        {
            if(seen.contains(n))
            {
                duplicateStore.add(n); // if item already in seen-set then add to duplicate set
            }
            else {
                seen.add(n); // if item not in the seen set
            }
        }
        return duplicateStore;

    }
}
