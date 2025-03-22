package PracticeInterview.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {

        String s="leetcodel";
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            } else {
                    map.put(c,1);
            }
        }
        for(char c: s.toCharArray())
        {
            if(map.get(c)==1)
            {
                System.out.println(c);
                break;
            }
        }
    }
}
