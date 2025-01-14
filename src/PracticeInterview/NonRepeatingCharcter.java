package PracticeInterview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharcter {

    public static void main(String[] args) {
        String str = "automation";
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char a:str.toCharArray())
        {
            if(map.containsKey(a))
            {
               map.put(a,map.get(a)+1);

            }
            else
            {
                map.put(a,1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println("first repeating character");
                System.out.println(entry.getKey()+" "+entry.getValue());
                break;
            }
        }
    }
}
