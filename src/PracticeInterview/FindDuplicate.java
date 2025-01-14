package PracticeInterview;

import java.util.HashSet;
import java.util.Iterator;

public class FindDuplicate {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 4, 8, 7, 8};
        findduplicate(arr);
    }

    public static void findduplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Dupliacte elements are ");
        for (int num : arr) {
            if (!(set.add(num))) {
                System.out.println(num);
            }
        }
        System.out.println("items in set are ");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
