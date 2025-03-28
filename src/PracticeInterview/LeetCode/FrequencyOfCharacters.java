package PracticeInterview.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String s = "abcabc";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toLowerCase().toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.print("<");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            System.out.print("(" + entry.getKey() + "," + entry.getValue() + ")");
            System.out.print(",");
        }
        System.out.print(">");
    }
}

