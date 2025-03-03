package PracticeInterview.PracticeString;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesofEachCharacter {
    public static void main(String[] args) {

        String data = "hello";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : data.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
      for(Map.Entry<Character,Integer> entry : map.entrySet())
      {
          System.out.println(entry.getKey()+ "-->"+entry.getValue());
      }
    }


   
}
