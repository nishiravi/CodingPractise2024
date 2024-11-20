package Programs;

import java.util.HashSet;

public class FindDuplicatesNumbers {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 4, 6, 9, 9};
        findDuplicatesNumber(arr);
    }

    public static void findDuplicatesNumber(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Duplicate elements:");
        for (int num : arr) {
            if (!set.add(num)) {  //This evaluates to true if set.add(num) returns false,
                // meaning the element num was already in the set.
                System.out.println(num);
            }
        }

    }
}
