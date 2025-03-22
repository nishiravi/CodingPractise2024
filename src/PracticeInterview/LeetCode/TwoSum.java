package PracticeInterview.LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

    public static void main(String[] args) {

        int[] num = {2, 3, 4, 5};
        int target = 5;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length - 1; i++) {
            map.put(num[i], i);
        }
        for (int i = 0; i < num.length - 1; i++) {
            if (map.containsKey(target - num[i]) && i!=map.get(target - num[i])) {
                System.out.println(i + "," + map.get(target - num[i]));
                return;
            }
        }
        System.out.println("No Solution found!");
    }
}
