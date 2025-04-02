package PracticeInterview.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FirstNonrepeatCharacter {
    public static void main(String[] args) {
        String s="Is it your firt company";
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toLowerCase().toCharArray())
        {
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        for(char c:s.toLowerCase().toCharArray())
        {
            if(map.get(c)==1)
            {
               System.out.println(c);
               return;
            }
        }

    }
}
