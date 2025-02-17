package PracticeString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        int flag=0;
        String data = "aabbtr";
        Map<Character, Integer> map = new HashMap();
        for (char c : data.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c,1);
            }
        }
        for (char c : data.toCharArray()) {
            if (map.get(c)==1) {
                System.out.println(c);
                flag=1; // when we find a nonrepeated character
                break;
            }

        }
        if(flag==0) // when there is no non repeated character print _
        {
            System.out.println("_");
        }
    }
}
