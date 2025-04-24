package PracticeInterview.StringsProgram;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
    public static void main(String[] args) {

        String s="Learn Java Programming";
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }
      //  System.out.print("repeating characters are");
        for(char c:map.keySet())
        {
            if(map.get(c)>1)
            {
                System.out.println(c +":"+map.get(c));
            }
        }
    }
}
