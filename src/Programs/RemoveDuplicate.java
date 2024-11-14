package Programs;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.PriorityQueue;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String data="pepe";
        String expectedString=removeDuplicate(data);
        System.out.println("input string is  "+data);
        System.out.println(" String after removing the duplicates is   "+expectedString);
    }
 public static String  removeDuplicate(String str)
 {
     LinkedHashSet<Character> newdata= new LinkedHashSet<>();
     for( char a: str.toCharArray())
     {
         newdata.add(a);
     }
     StringBuilder newString=new StringBuilder();
     for( char b: newdata)
     {
         newString.append(b);
     }
     return newString.toString();
 }
}
