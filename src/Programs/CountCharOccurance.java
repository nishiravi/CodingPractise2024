package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharOccurance {
    public static void main(String[] args) {
        String data = "Nishi";
        String input=data.toLowerCase();
        HashMap<Character, Integer> map=new HashMap<>();
        for( Character a: data.toCharArray())
        {
            if(map.containsKey(a))
            {
                map.put(a,map.get(a)+1);
            }
            else
                map.put(a,1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet())
            {
                System.out.println(entry.getKey() + "  "+entry.getValue());
            }

    }
}