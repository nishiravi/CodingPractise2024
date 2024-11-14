package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharOccurance {
    public static void main(String[] args) {
        String data="Nishi";
        data=data.toLowerCase();
        HashMap<Character, Integer> map=new HashMap<>();
        for(char alphabet: data.toCharArray())
        {
            if(map.containsKey(alphabet))
           {
               map.put(alphabet,map.get(alphabet)+1);
           }
           else
               map.put(alphabet,1);

        }
      for(Map.Entry<Character,Integer> entry:map.entrySet())
      {
            System.out.println(entry.getKey()+ " -->"+entry.getValue());
      }
    }
}
