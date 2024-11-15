package Programs;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.PriorityQueue;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String input = "pepe";
        String data = input.toUpperCase();
        System.out.println("input string " + data);
        String outputString = removeDuplicate(data);
        System.out.println("output string " + outputString);
    }

        public static String removeDuplicate(String str)
        {
            LinkedHashSet<Character> a=new LinkedHashSet<>();
        for(Character alpha:str.toCharArray())
        {
         a.add(alpha);
        }

        StringBuilder text=new StringBuilder();
        for( Character b: a)
        {
            text.append(b);
        }
        return text.toString();
    }

}
