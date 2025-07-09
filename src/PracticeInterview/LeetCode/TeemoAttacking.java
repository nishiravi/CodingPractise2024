package PracticeInterview.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class TeemoAttacking {
    public static void main(String[] args) {
        int duration = 2;
        int[] timeSeries = {1, 2};
        int result = findPoisonedDuration(timeSeries, duration);
        System.out.print(result);
    }

    private static int findPoisonedDuration(int[] timeSeries, int duration) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < timeSeries.length; i++) {
            int temp = 0;
            int tempduration = duration;
            while (tempduration != 0) {
                set.add(timeSeries[i] + temp);temp++;
                tempduration--;
            }
        }
        return set.size();
    }
}
