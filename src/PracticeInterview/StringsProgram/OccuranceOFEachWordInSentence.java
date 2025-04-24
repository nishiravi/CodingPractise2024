package PracticeInterview.StringsProgram;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOFEachWordInSentence {
    public static void main(String[] args) {
        String s="Test Automation Java Automation";
        Map<String,Integer> map=new HashMap<>();
        for(String a:s.split(" "))
        {
            if(map.containsKey(a))
            {
                map.put(a,map.get(a)+1);
            } else {
                map.put(a,1);
            }
        }
        for(Map.Entry<String, Integer> entry:map.entrySet())
        {
       System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
